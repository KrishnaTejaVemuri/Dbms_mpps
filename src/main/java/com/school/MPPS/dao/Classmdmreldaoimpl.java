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

import com.school.MPPS.Model.Classmdmrel;

@Repository
public class Classmdmreldaoimpl implements Cmdmdao{
	NamedParameterJdbcTemplate npjt;
	@Autowired
	public void setNameParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) 
	{
	this.npjt = namedParameterJdbcTemplate ;
	}
	
	private static final class Mappingrow implements RowMapper<Classmdmrel>
	{
		public Classmdmrel mapRow(ResultSet rs,int rowNum) throws SQLException
		   {
			   Classmdmrel Sd=new Classmdmrel();
			   Sd.setClassid(rs.getInt("classid"));
			   Sd.setMdmid(rs.getInt("mdmid"));
			   return Sd;
			   
		   }
	}
	
	private SqlParameterSource gSPBM(Classmdmrel Sd)
	   {
		   MapSqlParameterSource paramSource =new MapSqlParameterSource();
		   if(Sd!= null)
		   {
			   paramSource.addValue("classid", Sd.getClassid());
			   paramSource.addValue("mdmid", Sd.getMdmid());

			   
		   }
		   
		   
		   return paramSource;
	   }
	@Override
	public List<Classmdmrel> ListallCmdmrels() {
		// TODO Auto-generated method stub
		String qry="SELECT * FROM classmdmrel";
		List<Classmdmrel> stds=npjt.query(qry,gSPBM(null) , new Mappingrow());
		return stds;
	}
	@Override
	public void addClassmdmrel(Classmdmrel Classmdmrel) {
		// TODO Auto-generated method stub
		String qry="insert into classmdmrel(classid,mdmid) values (:classid,:mdmid)";
		npjt.update(qry, gSPBM(Classmdmrel));
	}
	@Override
	public Classmdmrel findClassmdmrelById(int id) {
		// TODO Auto-generated method stub
		String qry="SELECT * FROM classmdmrel WHERE mdmid=:mdmid";
		return npjt.queryForObject(qry,gSPBM(new Classmdmrel(id)),new Mappingrow());
	
	}
}
