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

import com.school.MPPS.Model.Mppsexam;

@Repository
public class Mppsexamdaoimpl implements Mppsexamdao{
	NamedParameterJdbcTemplate npjt;
	@Autowired
	public void setNameParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) 
	{
	this.npjt = namedParameterJdbcTemplate ;
	}
	
	private static final class Mappingrow implements RowMapper<Mppsexam>
	{
		public Mppsexam mapRow(ResultSet rs,int rowNum) throws SQLException
		   {
			   Mppsexam Sd=new Mppsexam();
			   Sd.setExamid(rs.getInt("examid"));
			   Sd.setExamname(rs.getString("examname"));
			   Sd.setMarksobtained(rs.getFloat("marksobtained"));
			   Sd.setMaxmarks(rs.getFloat("maxmarks"));
			   Sd.setMppssid(rs.getInt("mppssid"));
			   return Sd;
			   
		   }
	}
	
	private SqlParameterSource gSPBM(Mppsexam Sd)
	   {
		   MapSqlParameterSource paramSource =new MapSqlParameterSource();
		   if(Sd!= null)
		   {
			   paramSource.addValue("examid", Sd.getExamid());
			   paramSource.addValue("mppssid", Sd.getMppssid());
			   paramSource.addValue("examname", Sd.getExamname());
			   paramSource.addValue("marksobtained", Sd.getMarksobtained());
			   paramSource.addValue("maxmarks", Sd.getMaxmarks());
			   
		   }
		   
		   
		   return paramSource;
	   }

	@Override
	public List<Mppsexam> ListallMppsexams() {
		// TODO Auto-generated method stub
		String qry="SELECT * FROM mppsexam";
		List<Mppsexam> stds=npjt.query(qry,gSPBM(null) , new Mappingrow());
		return stds;
	}

	@Override
	public void addMppsexam(Mppsexam Mppsexam) {
		// TODO Auto-generated method stub
		String qry="insert into Mppsexam(examid,examname,mppssid,marksobtained,maxmarks)) values (:examid,:examname,:mppssid,:marksobtained,:maxmarks)";
		npjt.update(qry, gSPBM(Mppsexam));
	}

	@Override
	public void updateMppsexam(Mppsexam Mppsexam) {
		// TODO Auto-generated method stub
		String qry="UPDATE mppsexam set mppssid=:mppssid,examname=:examname,marksobtained=:marksobtained,maxmarks=:maxmarks where examid=:examid";
		npjt.update(qry, gSPBM(Mppsexam));
	}

	@Override
	public void deleteMppsexam(int id) {
		// TODO Auto-generated method stub
		String qry="DELETE FROM mppsexam WHERE examid=:examid";
		npjt.update(qry,gSPBM(new Mppsexam(id)));
	}

	@Override
	public Mppsexam findMppsexamById(int id) {
		// TODO Auto-generated method stub
		String qry="SELECT * FROM mppsexam WHERE examid=:examid";
		return npjt.queryForObject(qry,gSPBM(new Mppsexam(id)),new Mappingrow());
	
	}

}
