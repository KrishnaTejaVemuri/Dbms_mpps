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

import com.school.MPPS.Model.Cashssa;


@Repository
public class Cashssadaoimpl implements Cashssadao{
	NamedParameterJdbcTemplate npjt;
	@Autowired
	public void setNameParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) 
	{
	this.npjt = namedParameterJdbcTemplate ;
	}
	
	private static final class Mappingrow implements RowMapper<Cashssa>
	{
		public Cashssa mapRow(ResultSet rs,int rowNum) throws SQLException
		   {
			   Cashssa Sd=new Cashssa();
			   Sd.setSgid(rs.getInt("sgid"));
			   Sd.setMonth(rs.getString("month"));
			   Sd.setMaintainancegrant(rs.getFloat("maintainancegrant"));
			   Sd.setSchoolgrant(rs.getFloat("schoolgrant"));
			   return Sd;
			   
		   }
	}
	
	private SqlParameterSource gSPBM(Cashssa Sd)
	   {
		   MapSqlParameterSource paramSource =new MapSqlParameterSource();
		   if(Sd!= null)
		   {
			   paramSource.addValue("sgid", Sd.getSgid());
			   paramSource.addValue("month", Sd.getMonth());
			   paramSource.addValue("maintainancegrant", Sd.getMaintainancegrant());
			   paramSource.addValue("schoolgrant", Sd.getSchoolgrant());

			   
		   }
		   
		   
		   return paramSource;
	   }

	@Override
	public List<Cashssa> Listallcashssas() {
		// TODO Auto-generated method stub
		String qry="SELECT * FROM cashssa";
		List<Cashssa> stds=npjt.query(qry,gSPBM(null) , new Mappingrow());
		return stds;
	}

	@Override
	public void addcashssa(Cashssa cashssa) {
		// TODO Auto-generated method stub
		String qry="insert into cashssa(sgid,month,maintainancegrant,schoolgrant) values (:sgid,:month,:maintainancegrant,:schoolgrant)";
		npjt.update(qry, gSPBM(cashssa));
	}

	@Override
	public void updatecashssa(Cashssa cashssa) {
		// TODO Auto-generated method stub
		String qry="UPDATE cashssa set month=:month,maintainancegrant=:maintainancegrant,schoolgrant=:schoolgrant where sgid=:sgid";
		npjt.update(qry, gSPBM(cashssa));
	}

	@Override
	public void deletecashssa(int id) {
		// TODO Auto-generated method stub
		String qry="DELETE FROM cashssa WHERE sgid=:sgid";
		npjt.update(qry,gSPBM(new Cashssa(id)));
	}

	@Override
	public Cashssa findcashssaById(int id) {
		// TODO Auto-generated method stub
		String qry="SELECT * FROM cashssa WHERE sgid=:sgid";
		return npjt.queryForObject(qry,gSPBM(new Cashssa(id)),new Mappingrow());
	
	}
	
	
}
