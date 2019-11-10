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

import com.school.MPPS.Model.Mppsstudent;
@Repository
public class MppsstudentdaoImpl implements Mppsstudentdao{
	
	NamedParameterJdbcTemplate npjt;
	@Autowired
	public void setNameParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) 
	{
	this.npjt = namedParameterJdbcTemplate ;
	}
	
	private static final class Mappingrow implements RowMapper<Mppsstudent>
	{
		public Mppsstudent mapRow(ResultSet rs,int rowNum) throws SQLException
		   {
			   Mppsstudent Sd=new Mppsstudent();
			   Sd.setMppssid(rs.getInt("mppssid"));
			   Sd.setFirstname(rs.getString("firstname"));
			   Sd.setLastname(rs.getString("lastname"));
			   Sd.setAge(rs.getInt("age"));
			   Sd.setCaste(rs.getString("caste"));
			   Sd.setClassid(rs.getInt("classid"));
			   Sd.setGender(rs.getString("gender"));
			   Sd.setSchoolid(rs.getInt("schoolid"));
			   return Sd;
			   
		   }
	}
	
	private SqlParameterSource gSPBM(Mppsstudent Sd)
	   {
		   MapSqlParameterSource paramSource =new MapSqlParameterSource();
		   if(Sd!= null)
		   {
			   paramSource.addValue("mppssid", Sd.getMppssid());
			   paramSource.addValue("firstname", Sd.getFirstname());
			   paramSource.addValue("lastname", Sd.getLastname());
			   paramSource.addValue("age", Sd.getAge());
			   paramSource.addValue("gender", Sd.getGender());
			   paramSource.addValue("caste",Sd.getCaste());
			   paramSource.addValue("schoolid", Sd.getSchoolid());
			   paramSource.addValue("classid", Sd.getClassid());
			   
		   }
		   
		   
		   return paramSource;
	   }

	@Override
	public List<Mppsstudent> Listallstudents() {
		// TODO Auto-generated method stub
		String qry="SELECT * FROM mppsstudent";
		List<Mppsstudent> stds=npjt.query(qry,gSPBM(null) , new Mappingrow());
		return stds;
	}

	@Override
	public void addMppsstudent(Mppsstudent MppsStudent) {
		// TODO Auto-generated method stub
		String qry="insert into mppsstudent(mppssid,firstname,lastname,age,caste,gender,schoolid,classid) values (:mppssid,:firstname,:lastname,:age,:caste,:gender,:schoolid,:classid)";
		npjt.update(qry, gSPBM(MppsStudent));
	}

	@Override
	public void updateMppsstudent(Mppsstudent MppsStudent) {
		// TODO Auto-generated method stub
		String qry="UPDATE mppsstudent set firstname=:firstname,lastname=:lastname,age=:age,caste=:caste,gender=:gender,schoolid=:schoolid,classid=:classid where mppssid=:mppssid";
		npjt.update(qry, gSPBM(MppsStudent));	
	}

	@Override
	public void deleteMppsStudent(int id) {
		// TODO Auto-generated method stub

		String qry="DELETE FROM mppsstudent WHERE mppssid=:mppssid";
		npjt.update(qry,gSPBM(new Mppsstudent(id)));
	}

	@Override
	public Mppsstudent findMppsStudentById(int id) {
		// TODO Auto-generated method stub
		String qry="SELECT * FROM mppsstudent WHERE mppssid=:mppssid";
		return npjt.queryForObject(qry,gSPBM(new Mppsstudent(id)),new Mappingrow());
	
	}

	
	
	}


