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

import com.school.MPPS.Model.Scholarship;

@Repository
public class Scholarshipdaoimpl implements Scholarshipdao{
	NamedParameterJdbcTemplate npjt;
	@Autowired
	public void setNameParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) 
	{
	this.npjt = namedParameterJdbcTemplate ;
	}
	
	private static final class Mappingrow implements RowMapper<Scholarship>
	{
		public Scholarship mapRow(ResultSet rs,int rowNum) throws SQLException
		   {
			   Scholarship Sd=new Scholarship();
			   Sd.setAplid(rs.getInt("aplid"));
			   Sd.setAppliedamount(rs.getFloat("appliedamount"));
			   Sd.setGrantamount(rs.getFloat("grantamount"));
			   Sd.setStatus(rs.getString("status"));
			   Sd.setMppssid(rs.getInt("mppssid"));
			   return Sd;
			   
		   }
	}
	
	private SqlParameterSource gSPBM(Scholarship Sd)
	   {
		   MapSqlParameterSource paramSource =new MapSqlParameterSource();
		   if(Sd!= null)
		   {
			   paramSource.addValue("Aplid",Sd.getAplid());
			   paramSource.addValue("appliedamount", Sd.getAppliedamount());
			   paramSource.addValue("grantamount",Sd.getGrantamount());
			   paramSource.addValue("status",Sd.getStatus());
			   paramSource.addValue("mppssid",Sd.getMppssid());
			   
		   }
		   
		   
		   return paramSource;
	   }

	@Override
	public List<Scholarship> ListallScholarships() {
		// TODO Auto-generated method stub
		String qry="SELECT * FROM scholarship";
		List<Scholarship> stds=npjt.query(qry,gSPBM(null) , new Mappingrow());
		return stds;
	}

	@Override
	public void addScholarship(Scholarship Scholarship) {
		// TODO Auto-generated method stub
		String qry="insert into scholarship(aplid,applicationamount,grantamount,mppssid,status)) values (:aplid,:applicationamount,:grantamount,:mppssid,:status)";
		npjt.update(qry, gSPBM(Scholarship));
	}

	@Override
	public void updateScholarship(Scholarship Scholarship) {
		// TODO Auto-generated method stub
		String qry="UPDATE scholarship set applicationamount=:applicationamount,grantamount=:grantamount,mppssid=:mppssid,status=:status where aplid=:aplid";
		npjt.update(qry, gSPBM(Scholarship));
	}

	@Override
	public void deleteScholarship(int id) {
		// TODO Auto-generated method stub
		String qry="DELETE FROM scholarship WHERE aplid=:aplid";
		npjt.update(qry,gSPBM(new Scholarship(id)));
	}

	@Override
	public Scholarship findScholarshipById(int id) {
		// TODO Auto-generated method stub
		String qry="SELECT * FROM scholarship WHERE aplid=:aplid";
		return npjt.queryForObject(qry,gSPBM(new Scholarship(id)),new Mappingrow());
	}

}
