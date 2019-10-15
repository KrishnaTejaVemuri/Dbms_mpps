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

import com.school.MPPS.Model.Messstock;

@Repository
public class Messstockdaoimpl implements Messstockdao {
	NamedParameterJdbcTemplate npjt;
	@Autowired
	public void setNameParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) 
	{
	this.npjt = namedParameterJdbcTemplate ;
	}
	
	private static final class Mappingrow implements RowMapper<Messstock>
	{
		public Messstock mapRow(ResultSet rs,int rowNum) throws SQLException
		   {
			   Messstock Sd=new Messstock();
			   Sd.setMsid(rs.getInt("msid"));
			   Sd.setNoeggs(rs.getInt("noeggs"));
			   Sd.setMonth(rs.getString("month"));
			   Sd.setRicekgs(rs.getInt("ricekgs"));
			   return Sd;
			   
		   }
	}
	
	private SqlParameterSource gSPBM(Messstock Sd)
	   {
		   MapSqlParameterSource paramSource =new MapSqlParameterSource();
		   if(Sd!= null)
		   {
			   paramSource.addValue("msid", Sd.getMsid());
			   paramSource.addValue("noeggs", Sd.getNoeggs());
			   paramSource.addValue("month", Sd.getMonth());
			   paramSource.addValue("ricekgs", Sd.getRicekgs());
			   
			   
		   }
		   
		   
		   return paramSource;
	   }

	@Override
	public List<Messstock> ListallMessstock() {
		// TODO Auto-generated method stub
		String qry="SELECT * FROM messstock";
		List<Messstock> stds=npjt.query(qry,gSPBM(null) , new Mappingrow());
		return stds;
	}

	@Override
	public void addMessstock(Messstock Messstock) {
		// TODO Auto-generated method stub
		String qry="insert into messstock(msid,noeggs,month,ricekgs)) values (:msid,:noeggs,:month,:ricekgs)";
		npjt.update(qry, gSPBM(Messstock));
	}

	@Override
	public void updateMessstock(Messstock Messstock) {
		// TODO Auto-generated method stub
		String qry="UPDATE messstock set noeggs=:noeggs,month=:month,ricekgs=:ricekgs where msid=:msid";
		npjt.update(qry, gSPBM(Messstock));
	}

	@Override
	public void deleteMessstock(int id) {
		// TODO Auto-generated method stub
		String qry="DELETE FROM messstock WHERE msid=:msid";
		npjt.update(qry,gSPBM(new Messstock(id)));
	}

	@Override
	public Messstock findMessstockById(int id) {
		// TODO Auto-generated method stub
		String qry="SELECT * FROM messstock WHERE msid=:msid";
		return npjt.queryForObject(qry,gSPBM(new Messstock(id)),new Mappingrow());
	
	}

}
