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

import com.school.MPPS.Model.Teacherleave;

@Repository
public class Teacherleavedaoimpl implements Teacherleavedao{
	NamedParameterJdbcTemplate npjt;
	@Autowired
	public void setNameParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) 
	{
	this.npjt = namedParameterJdbcTemplate ;
	}
	
	private static final class Mappingrow implements RowMapper<Teacherleave>
	{
		public Teacherleave mapRow(ResultSet rs,int rowNum) throws SQLException
		   {
			   Teacherleave Sd=new Teacherleave();
			   Sd.setTlid(rs.getInt("tlid"));
			   Sd.setFromdate(rs.getString("fromdate"));
			   Sd.setTodate(rs.getString("todate"));
			   Sd.setTid(rs.getInt("tid"));
			   Sd.setType(rs.getString("type"));
			   return Sd;
			   
		   }
	}
	
	private SqlParameterSource gSPBM(Teacherleave Sd)
	   {
		   MapSqlParameterSource paramSource =new MapSqlParameterSource();
		   if(Sd!= null)
		   {
			   paramSource.addValue("tlid", Sd.getTlid());
			   paramSource.addValue("fromdate", Sd.getFromdate());
			   paramSource.addValue("todate", Sd.getTodate());
			   paramSource.addValue("tid", Sd.getTid());
			   paramSource.addValue("type", Sd.getType());
			   
		   }
		   
		   
		   return paramSource;
	   }

	@Override
	public List<Teacherleave> ListallTeacherleaves() {
		// TODO Auto-generated method stub
		String qry="SELECT * FROM teacherleave";
		List<Teacherleave> stds=npjt.query(qry,gSPBM(null) , new Mappingrow());
		return stds;
	}

	@Override
	public void addTeacherleave(Teacherleave Teacherleave) {
		// TODO Auto-generated method stub
		String qry="insert into teacherleave(tlid,fromdate,todate,type,tid)) values (:tlid,:fromdate,:todate,:type,:tid)";
		npjt.update(qry, gSPBM(Teacherleave));
	}

	@Override
	public void updateTeacherleave(Teacherleave Teacherleave) {
		// TODO Auto-generated method stub
		String qry="UPDATE teacherleave set fromdate=:fromdate,todate=:todate,type=:type,tid=:tid where tlid=:tlid";
		npjt.update(qry, gSPBM(Teacherleave));
	}

	@Override
	public void deleteTeacherleave(int id) {
		// TODO Auto-generated method stub
		String qry="DELETE FROM teacherleave WHERE tlid=:tlid";
		npjt.update(qry,gSPBM(new Teacherleave(id)));
	}

	@Override
	public Teacherleave findTeacherleaveById(int id) {
		// TODO Auto-generated method stub
		String qry="SELECT * FROM teacherleave WHERE tlid=:tlid";
		return npjt.queryForObject(qry,gSPBM(new Teacherleave(id)),new Mappingrow());
	
	}

}
