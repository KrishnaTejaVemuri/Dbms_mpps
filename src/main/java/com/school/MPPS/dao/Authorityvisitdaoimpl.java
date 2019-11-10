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

import com.school.MPPS.Model.Authoritiesvisit;


@Repository
public class Authorityvisitdaoimpl implements Authoritiesvisitdao{
	NamedParameterJdbcTemplate npjt;
	@Autowired
	public void setNameParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) 
	{
	this.npjt = namedParameterJdbcTemplate ;
	}
	
	private static final class Mappingrow implements RowMapper<Authoritiesvisit>
	{
		public Authoritiesvisit mapRow(ResultSet rs,int rowNum) throws SQLException
		   {
			   Authoritiesvisit Sd=new Authoritiesvisit();
			   Sd.setAuid(rs.getInt("auid"));
			   Sd.setDesignation(rs.getString("designation"));
			   Sd.setAuthname(rs.getString("authname"));
			   Sd.setDov(rs.getString("dov"));
			   Sd.setRemarks(rs.getString("remarks"));
			   return Sd;
			   
		   }
	}
	
	private SqlParameterSource gSPBM(Authoritiesvisit Sd)
	   {
		   MapSqlParameterSource paramSource =new MapSqlParameterSource();
		   if(Sd!= null)
		   {
			   paramSource.addValue("auid", Sd.getAuid());
			   paramSource.addValue("designation", Sd.getDesignation());
			   paramSource.addValue("authname", Sd.getAuthname());
			   paramSource.addValue("dov", Sd.getDov());
			   paramSource.addValue("remarks", Sd.getRemarks());
			   
		   }
		   
		   
		   return paramSource;
	   }

	@Override
	public List<Authoritiesvisit> Listallvisits() {
		// TODO Auto-generated method stub
		String qry="SELECT * FROM authoritiesvisit";
		List<Authoritiesvisit> stds=npjt.query(qry,gSPBM(null) , new Mappingrow());
		return stds;
	}

	@Override
	public void addAuthoritiesvisit(Authoritiesvisit Authoritiesvisit) {
		// TODO Auto-generated method stub
		String qry="insert into authoritiesvisit(authname,designation,dov,remarks) values (:authname,:designation,:dov,:remarks)";
		npjt.update(qry, gSPBM(Authoritiesvisit));
	}

	@Override
	public void updateAuthoritiesvisit(Authoritiesvisit Authoritiesvisit) {
		// TODO Auto-generated method stub
		String qry="UPDATE authoritiesvisit set authname=:authname,designation=:designation,dov=:dov,remarks=:remarks where auid=:auid";
		npjt.update(qry, gSPBM(Authoritiesvisit));
	}

	@Override
	public void deleteAuthoritiesvisit(int id) {
		// TODO Auto-generated method stub
		String qry="DELETE FROM authoritiesvisit WHERE auid=:auid";
		npjt.update(qry,gSPBM(new Authoritiesvisit(id)));
	}

	@Override
	public Authoritiesvisit findAuthoritiesvisitById(int id) {
		// TODO Auto-generated method stub
		String qry="SELECT * FROM authoritiesvisit WHERE auid=:auid";
		return npjt.queryForObject(qry,gSPBM(new Authoritiesvisit(id)),new Mappingrow());
	
	}
	
}
