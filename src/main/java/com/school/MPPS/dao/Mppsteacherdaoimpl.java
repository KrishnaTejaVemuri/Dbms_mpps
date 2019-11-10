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

import com.school.MPPS.Model.Mppsteacher;

@Repository
public class Mppsteacherdaoimpl implements Mppsteacherdao{
	NamedParameterJdbcTemplate npjt;
	@Autowired
	public void setNameParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) 
	{
	this.npjt = namedParameterJdbcTemplate ;
	}
	
	private static final class Mappingrow implements RowMapper<Mppsteacher>
	{
		public Mppsteacher mapRow(ResultSet rs,int rowNum) throws SQLException
		   {
			   Mppsteacher Sd=new Mppsteacher();
			   Sd.setMppstid(rs.getInt("mppstid"));
			   Sd.setFirstname(rs.getString("firstname"));
			   Sd.setLastname(rs.getString("lastname"));
			   Sd.setAge(rs.getInt("age"));
			   Sd.setCaste(rs.getString("caste"));
			   Sd.setCat(rs.getString("cat"));
			   Sd.setEdq(rs.getString("edq"));
			   Sd.setUserid(rs.getInt("userid"));
			   return Sd;
			   
		   }
	}
	
	private SqlParameterSource gSPBM(Mppsteacher Sd)
	   {
		   MapSqlParameterSource paramSource =new MapSqlParameterSource();
		   if(Sd!= null)
		   {
			   paramSource.addValue("mppstid", Sd.getMppstid());
			   paramSource.addValue("firstname", Sd.getFirstname());
			   paramSource.addValue("lastname", Sd.getLastname());
			   paramSource.addValue("age", Sd.getAge());
			   paramSource.addValue("cat", Sd.getCat());
			   paramSource.addValue("caste",Sd.getCaste());
			   paramSource.addValue("edq", Sd.getEdq());
			   paramSource.addValue("userid", Sd.getUserid());
			   
		   }
		   
		   
		   return paramSource;
	   }

	@Override
	public List<Mppsteacher> Listallteachers() {
		// TODO Auto-generated method stub
		String qry="SELECT * FROM mppsteacher";
		List<Mppsteacher> stds=npjt.query(qry,gSPBM(null) , new Mappingrow());
		return stds;
	}

	@Override
	public void addMppsteacher(Mppsteacher Mppsteacher) {
		// TODO Auto-generated method stub
		String qry="insert into mppsteacher(mppstid,firstname,lastname,age,caste,cat,edq,userid) values (:mppstid,:firstname,:lastname,:age,:caste,:cat,:edq,:userid)";
		npjt.update(qry, gSPBM(Mppsteacher));
	}

	@Override
	public void updateMppsteacher(Mppsteacher Mppsteacher) {
		// TODO Auto-generated method stub
		String qry="UPDATE mppsteacher set firstname=:firstname,lastname=:lastname,age=:age,caste=:caste,cat=:cat,edq=:edq,userid=:userid where mppstid=:mppstid";
		npjt.update(qry, gSPBM(Mppsteacher));
		
	}

	@Override
	public void deleteMppsteacher(int id) {
		// TODO Auto-generated method stub
		String qry="DELETE FROM mppsteacher WHERE mppstid=:mppstid";
		npjt.update(qry,gSPBM(new Mppsteacher(id)));
	}

	@Override
	public Mppsteacher findMppsteacherById(int id) {
		// TODO Auto-generated method stub
		String qry="SELECT * FROM mppsteacher WHERE mppstid=:mppstid";
		return npjt.queryForObject(qry,gSPBM(new Mppsteacher(id)),new Mappingrow());
	
	}

}
