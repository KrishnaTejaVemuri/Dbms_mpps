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

import com.school.MPPS.Model.Prevschool;

@Repository
public class Prevschooldaoimpl implements Prevschooldao{
	NamedParameterJdbcTemplate npjt;
	@Autowired
	public void setNameParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) 
	{
	this.npjt = namedParameterJdbcTemplate ;
	}
	
	private static final class Mappingrow implements RowMapper<Prevschool>
	{
		public Prevschool mapRow(ResultSet rs,int rowNum) throws SQLException
		   {
			   Prevschool Sd=new Prevschool();
			   Sd.setSchoolid(rs.getInt("schoolid"));
			   Sd.setSchoolname(rs.getString("schoolname"));
			   Sd.setContactno(rs.getString("contactno"));
			   return Sd;
			   
		   }
	}
	
	private SqlParameterSource gSPBM(Prevschool Sd)
	   {
		   MapSqlParameterSource paramSource =new MapSqlParameterSource();
		   if(Sd!= null)
		   {
			   paramSource.addValue("schoolid", Sd.getSchoolid());
			   paramSource.addValue("schoolname", Sd.getSchoolname());
			   paramSource.addValue("contactno", Sd.getContactno());
		   }
		   
		   
		   return paramSource;
	   }

	@Override
	public List<Prevschool> ListallPrevschools() {
		// TODO Auto-generated method stub
		String qry="SELECT * FROM prevschool";
		List<Prevschool> stds=npjt.query(qry,gSPBM(null) , new Mappingrow());
		return stds;
	}

	@Override
	public void addPrevschool(Prevschool Prevschool) {
		// TODO Auto-generated method stub
		String qry="insert into prevschool(schoolid,schoolname,contactno)) values (:schoolid,:schoolname,:contactno)";
		npjt.update(qry, gSPBM(Prevschool));
	}

	@Override
	public void updatePrevschool(Prevschool Prevschool) {
		// TODO Auto-generated method stub
		String qry="UPDATE prevschool set schoolname=:schoolname where schoolid=:schoolid";
		npjt.update(qry, gSPBM(Prevschool));
	}

	@Override
	public void deletePrevschool(int id) {
		// TODO Auto-generated method stub
		String qry="DELETE FROM prevschool WHERE schoolid=:schoolid";
		npjt.update(qry,gSPBM(new Prevschool(id)));
	}

	@Override
	public Prevschool findPrevschoolById(int id) {
		// TODO Auto-generated method stub
		String qry="SELECT * FROM prevschool WHERE schoolid=:schoolid";
		return npjt.queryForObject(qry,gSPBM(new Prevschool(id)),new Mappingrow());
	
	}

}
