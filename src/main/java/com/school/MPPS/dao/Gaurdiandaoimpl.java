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

import com.school.MPPS.Model.Gaurdian;

@Repository
public class Gaurdiandaoimpl implements Mppsgaurdiandao{
	NamedParameterJdbcTemplate npjt;
	@Autowired
	public void setNameParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) 
	{
	this.npjt = namedParameterJdbcTemplate ;
	}
	
	private static final class Mappingrow implements RowMapper<Gaurdian>
	{
		public Gaurdian mapRow(ResultSet rs,int rowNum) throws SQLException
		   {
			   Gaurdian Sd=new Gaurdian();
			   Sd.setMppsgid(rs.getInt("mppsgid"));
			   Sd.setMppssid(rs.getInt("mppssid"));
			   Sd.setGname(rs.getString("gname"));
			   Sd.setRelation(rs.getString("relation"));
			   return Sd;
			   
		   }
	}
	
	private SqlParameterSource gSPBM(Gaurdian Sd)
	   {
		   MapSqlParameterSource paramSource =new MapSqlParameterSource();
		   if(Sd!= null)
		   {
			   paramSource.addValue("mppsgid", Sd.getMppsgid());
			   paramSource.addValue("mppssid", Sd.getMppssid());
			   paramSource.addValue("relation", Sd.getRelation());
			   paramSource.addValue("gname", Sd.getGname());
			   
		   }
		   
		   
		   return paramSource;
	   }

	@Override
	public List<Gaurdian> ListallGaurdians() {
		// TODO Auto-generated method stub
		String qry="SELECT * FROM gaurdian";
		List<Gaurdian> stds=npjt.query(qry,gSPBM(null) , new Mappingrow());
		return stds;
	
	}

	@Override
	public void addGaurdian(Gaurdian Gaurdian) {
		// TODO Auto-generated method stub
		String qry="insert into gaurdian(mppsgid,mppssid,relation,gname) values (:mppsgid,:mppssid,:relation,:gname)";
		npjt.update(qry, gSPBM(Gaurdian));
	}

	@Override
	public void updateGaurdian(Gaurdian Gaurdian) {
		// TODO Auto-generated method stub
		String qry="UPDATE gaurdian set mppssid=:mppssid,gname=:gname,relation=:relation where mppsgid=:mppsgid";
		npjt.update(qry, gSPBM(Gaurdian));
	}

	@Override
	public void deleteGaurdian(int id) {
		// TODO Auto-generated method stub
		String qry="DELETE FROM gaurdian WHERE mppsgid=:mppsgid";
		npjt.update(qry,gSPBM(new Gaurdian(id)));
	}

	@Override
	public Gaurdian findGaurdianById(int id) {
		// TODO Auto-generated method stub
		String qry="SELECT * FROM gaurdian WHERE mppsgid=:mppsgid";
		return npjt.queryForObject(qry,gSPBM(new Gaurdian(id)),new Mappingrow());
		
	}

}
