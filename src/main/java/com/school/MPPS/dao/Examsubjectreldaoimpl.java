package com.school.MPPS.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.school.MPPS.Model.Examsubjectrel;


@Repository
public class Examsubjectreldaoimpl implements Examsubjectreldao{
	NamedParameterJdbcTemplate npjt;
	@Autowired
	public void setNameParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) 
	{
	this.npjt = namedParameterJdbcTemplate ;
	}
	
	private static final class Mappingrow implements RowMapper<Examsubjectrel>
	{
		public Examsubjectrel mapRow(ResultSet rs,int rowNum) throws SQLException
		   {
			   Examsubjectrel Sd=new Examsubjectrel();
			   Sd.setExamid(rs.getInt("examid"));
			   Sd.setSubid(rs.getInt("subid"));
			   return Sd;
			   
		   }
	}
	
	private SqlParameterSource gSPBM(Examsubjectrel Sd)
	   {
		   MapSqlParameterSource paramSource =new MapSqlParameterSource();
		   if(Sd!= null)
		   {
			   paramSource.addValue("examid", Sd.getExamid());
			   paramSource.addValue("subid", Sd.getSubid());

			   
		   }
		   
		   
		   return paramSource;
	   }
	@Override
	public List<Examsubjectrel> ListallExamsubjectrels() {
		// TODO Auto-generated method stub
		String qry="SELECT * FROM examsubjectrel";
		List<Examsubjectrel> stds=npjt.query(qry,gSPBM(null) , new Mappingrow());
		return stds;
	}
	@Override
	public void addExamsubjectrel(Examsubjectrel Examsubjectrel) {
		// TODO Auto-generated method stub
		String qry="insert into examsubjectrel(examid,subid) values (:examid,:subid)";
		npjt.update(qry, gSPBM(Examsubjectrel));
	}
	@Override
	public Examsubjectrel findExamsubjectrelById(int id) {
		// TODO Auto-generated method stub
		String qry="SELECT * FROM examsubjectrel WHERE examid=:examid";
		return npjt.queryForObject(qry,gSPBM(new Examsubjectrel(id)),new Mappingrow());
	
	}
}
