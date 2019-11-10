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

import com.school.MPPS.Model.User;


@Repository
public class Userdaoimpl implements Userdao{
	NamedParameterJdbcTemplate npjt;
	@Autowired
	public void setNameParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) 
	{
	this.npjt = namedParameterJdbcTemplate ;
	}
	
	private static final class Mappingrow implements RowMapper<User>
	{
		public User mapRow(ResultSet rs,int rowNum) throws SQLException
		   {
			   User Sd=new User();
			   Sd.setId(rs.getInt("id"));
			   Sd.setUsername(rs.getString("username"));
			   Sd.setPassword(rs.getString("password"));
			   Sd.setRole(rs.getString("role"));
			   Sd.setActive(rs.getInt("active"));
			   return Sd;
			   
		   }
	}
	
	private SqlParameterSource gSPBM(User Sd)
	   {
		   MapSqlParameterSource paramSource =new MapSqlParameterSource();
		   if(Sd!= null)
		   {
			   paramSource.addValue("id", Sd.getId());
			   paramSource.addValue("username", Sd.getUsername());
			   paramSource.addValue("password", Sd.getPassword());
			   paramSource.addValue("active", Sd.getActive());
			   paramSource.addValue("role", Sd.getRole());
			   
		   }
		   
		   
		   return paramSource;
	   }
	@Override
	public List<User> ListallUsers() {
		// TODO Auto-generated method stub
		String qry="SELECT * FROM user";
		List<User> stds=npjt.query(qry,gSPBM(null) , new Mappingrow());
		return stds;
	}

	@Override
	public void addUser(User User) {
		// TODO Auto-generated method stub
		String qry="insert into user(id,username,password,active,role) values (:id,:username,:password,:active,:role)";
		npjt.update(qry, gSPBM(User));
	}

	@Override
	public void updateUser(User User) {
		// TODO Auto-generated method stub
		String qry="UPDATE user set username=:username,password=:password,active=:active,role=:role where id=:id";
		npjt.update(qry, gSPBM(User));
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		String qry="DELETE FROM user WHERE id=:id";
		npjt.update(qry,gSPBM(new User(id)));
	}

	@Override
	public User findUserById(int id) {
		// TODO Auto-generated method stub
		String qry="SELECT * FROM user WHERE id=:id";
		return npjt.queryForObject(qry,gSPBM(new User(id)),new Mappingrow());
	
	}

}
