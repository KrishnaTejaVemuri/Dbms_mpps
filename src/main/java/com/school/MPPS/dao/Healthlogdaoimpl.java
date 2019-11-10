package com.school.MPPS.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.school.MPPS.Model.Healthlog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;
@Repository
public class Healthlogdaoimpl implements Healthlogdao{
	NamedParameterJdbcTemplate npjt;
	@Autowired
	public void setNameParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) 
	{
	this.npjt = namedParameterJdbcTemplate ;
	}
	
	private static final class Mappingrow implements RowMapper<Healthlog>
	{
		public Healthlog mapRow(ResultSet rs,int rowNum) throws SQLException
		   {
			   Healthlog Sd=new Healthlog();
			   Sd.setCheckupid(rs.getInt("checkupid"));
			   Sd.setDate(rs.getString("date"));
			   Sd.setProblem(rs.getString("problem"));
			   Sd.setSid(rs.getInt("sid"));
			   return Sd;
			   
		   }
	}
	
	private SqlParameterSource gSPBM(Healthlog Sd)
	   {
		   MapSqlParameterSource paramSource =new MapSqlParameterSource();
		   if(Sd!= null)
		   {
			   paramSource.addValue("checkupid", Sd.getCheckupid());
			   paramSource.addValue("date", Sd.getDate());
			   paramSource.addValue("problem", Sd.getProblem());
			   paramSource.addValue("sid", Sd.getSid());
			   
			   
		   }
		   
		   
		   return paramSource;
	   }

	@Override
	public List<Healthlog> ListallHealthlogs() {
		// TODO Auto-generated method stub
		String qry="SELECT * FROM healthlog";
		List<Healthlog> stds=npjt.query(qry,gSPBM(null) , new Mappingrow());
		return stds;
	}

	@Override
	public void addHealthlog(Healthlog Healthlog) {
		// TODO Auto-generated method stub
		String qry="insert into healthlog(checkupid,date,problem,sid) values (:checkupid,:date,:problem,:sid)";
		npjt.update(qry, gSPBM(Healthlog));
	}

	@Override
	public void updateHealthlog(Healthlog Healthlog) {
		// TODO Auto-generated method stub
		String qry="UPDATE healthlog set date=:date,problem=:problem,sid=:sid where checkupid=:checkupid";
		npjt.update(qry, gSPBM(Healthlog));

	}

	@Override
	public void deleteHealthlog(int id) {
		// TODO Auto-generated method stub
		String qry="DELETE FROM healthlog WHERE checkupid=:checkupid";
		npjt.update(qry,gSPBM(new Healthlog(id)));
	}

	@Override
	public Healthlog findHealthlogById(int id) {
		// TODO Auto-generated method stub
		String qry="SELECT * FROM healthlog WHERE checkupid=:checkupid";
		return npjt.queryForObject(qry,gSPBM(new Healthlog(id)),new Mappingrow());
		}
	@Override
	public List<Healthlog> ListstudentHealthlogs(String id) {
		// TODO Auto-generated method stub
		String qry="SELECT * FROM healthlog where sid=:sid";
		List<Healthlog> stds=npjt.query(qry,gSPBM(new Healthlog(id)) , new Mappingrow());
		return stds;
	}
}
