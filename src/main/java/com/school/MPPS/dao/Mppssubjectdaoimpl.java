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

import com.school.MPPS.Model.Mppssubject;


@Repository
public class Mppssubjectdaoimpl implements Mppssubjectdao{
	NamedParameterJdbcTemplate npjt;
	@Autowired
	public void setNameParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) 
	{
	this.npjt = namedParameterJdbcTemplate ;
	}
	
	private static final class Mappingrow implements RowMapper<Mppssubject>
	{
		public Mppssubject mapRow(ResultSet rs,int rowNum) throws SQLException
		   {
			   Mppssubject Sd=new Mppssubject();
			   Sd.setSubid(rs.getInt("subid"));
			   Sd.setSubjectname(rs.getString("subjectname"));
			   Sd.setClassid(rs.getInt("classid"));
			   Sd.setMppstid(rs.getInt("mppstid"));
			    return Sd;
			   
		   }
	}
	
	private SqlParameterSource gSPBM(Mppssubject Sd)
	   {
		   MapSqlParameterSource paramSource =new MapSqlParameterSource();
		   if(Sd!= null)
		   {
			   paramSource.addValue("mppstid", Sd.getMppstid());
			   paramSource.addValue("subjectname", Sd.getSubjectname());
			   paramSource.addValue("subid", Sd.getSubid());
			   paramSource.addValue("classid", Sd.getClassid());
			   
		   }
		   
		   
		   return paramSource;
	   }

	@Override
	public List<Mppssubject> Listallsubjects() {
		// TODO Auto-generated method stub
		String qry="SELECT * FROM mppssubject";
		List<Mppssubject> stds=npjt.query(qry,gSPBM(null) , new Mappingrow());
		return stds;
	}

	@Override
	public void addMppssubject(Mppssubject Mppssubject) {
		// TODO Auto-generated method stub
		String qry="insert into mppssubject(subid,classid,mppstid,subjectname)) values (:subid,:classid,:mppstid,:subjectname)";
		npjt.update(qry, gSPBM(Mppssubject));
	}

	@Override
	public void updateMppssubject(Mppssubject Mppssubject) {
		// TODO Auto-generated method stub
		String qry="UPDATE mppssubject set classid=:classid,mppstid=:mppstid,subjectname=:subjectname where subid=:subid";
		npjt.update(qry, gSPBM(Mppssubject));	
	}

	@Override
	public void deleteMppssubject(int id) {
		// TODO Auto-generated method stub
		String qry="DELETE FROM mppssubject WHERE subid=:subid";
		npjt.update(qry,gSPBM(new Mppssubject(id)));
	}

	@Override
	public Mppssubject findMppssubjectById(int id) {
		// TODO Auto-generated method stub
		String qry="SELECT * FROM mppssubject WHERE subid=:subid";
		return npjt.queryForObject(qry,gSPBM(new Mppssubject(id)),new Mappingrow());
	
	}

}
