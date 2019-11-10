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

import com.school.MPPS.Model.Middaymeals;

@Repository
public class Middaymealsdaoimpl implements Middaymealsdao{
	NamedParameterJdbcTemplate npjt;
	@Autowired
	public void setNameParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) 
	{
	this.npjt = namedParameterJdbcTemplate ;
	}
	
	private static final class Mappingrow implements RowMapper<Middaymeals>
	{
		public Middaymeals mapRow(ResultSet rs,int rowNum) throws SQLException
		   {
			   Middaymeals Sd=new Middaymeals();
			   Sd.setMdmid(rs.getInt("mdmid"));
			   Sd.setNoofstudentsate(rs.getInt("noofstudentsate"));
			   Sd.setDate(rs.getString("date"));
			   Sd.setMsid(rs.getInt("msid"));
			   Sd.setStaffid(rs.getInt("staffid"));
			   return Sd;
			   
		   }
	}
	
	private SqlParameterSource gSPBM(Middaymeals Sd)
	   {
		   MapSqlParameterSource paramSource =new MapSqlParameterSource();
		   if(Sd!= null)
		   {
			   paramSource.addValue("mdmid", Sd.getMdmid());
			   paramSource.addValue("noofstudentsate", Sd.getNoofstudentsate());
			   paramSource.addValue("date", Sd.getDate());
			   paramSource.addValue("msid", Sd.getMsid());
			   paramSource.addValue("staffid", Sd.getStaffid());
			   
		   }
		   
		   
		   return paramSource;
	   }

	@Override
	public List<Middaymeals> ListallMiddaymealss() {
		// TODO Auto-generated method stub
		String qry="SELECT * FROM middaymeals";
		List<Middaymeals> stds=npjt.query(qry,gSPBM(null) , new Mappingrow());
		return stds;
	}

	@Override
	public void addMiddaymeals(Middaymeals Middaymeals) {
		// TODO Auto-generated method stub
		String qry="insert into middaymeals(mdmid,noofstudentsate,date,msid,staffid) values (:mdmid,:noofstudentsate,:date,:msid,:staffid)";
		npjt.update(qry, gSPBM(Middaymeals));
	}

	@Override
	public void updateMiddaymeals(Middaymeals Middaymeals) {
		// TODO Auto-generated method stub
		String qry="UPDATE middaymeals set noofstudentsate=:noofstudentsate,date=:date,msid=:msid,staffid=:staffid where mdmid=:mdmid";
		npjt.update(qry, gSPBM(Middaymeals));
	}

	@Override
	public void deleteMiddaymeals(int id) {
		// TODO Auto-generated method stub
		String qry="DELETE FROM middaymeals WHERE mdmid=:mdmid";
		npjt.update(qry,gSPBM(new Middaymeals(id)));
	}

	@Override
	public Middaymeals findMiddaymealsById(int id) {
		// TODO Auto-generated method stub
		String qry="SELECT * FROM middaymeals WHERE mdmid=:mdmid";
		return npjt.queryForObject(qry,gSPBM(new Middaymeals(id)),new Mappingrow());
	
	}

}
