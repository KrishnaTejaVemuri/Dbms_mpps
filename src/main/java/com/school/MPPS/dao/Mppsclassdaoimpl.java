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

import com.school.MPPS.Model.Mppsclass;
@Repository
public class Mppsclassdaoimpl implements Mppsclassdao{
	NamedParameterJdbcTemplate npjt;
	@Autowired
	public void setNameParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) 
	{
	this.npjt = namedParameterJdbcTemplate ;
	}
	
	private static final class Mappingrow implements RowMapper<Mppsclass>
	{
		public Mppsclass mapRow(ResultSet rs,int rowNum) throws SQLException
		   {
			   Mppsclass Sd=new Mppsclass();
			   Sd.setClassid(rs.getInt("classid"));
			   Sd.setRoomno(rs.getInt("roomno"));
			   return Sd;
			   
		   }
	}
	
	private SqlParameterSource gSPBM(Mppsclass Sd)
	   {
		   MapSqlParameterSource paramSource =new MapSqlParameterSource();
		   if(Sd!= null)
		   {
			   paramSource.addValue("classid", Sd.getClassid());
			   paramSource.addValue("roomno", Sd.getRoomno());
			   
		   }
		   
		   
		   return paramSource;
	   }

	@Override
	public List<Mppsclass> ListallMppsclasss() {
		// TODO Auto-generated method stub
		String qry="SELECT * FROM mppsclass";
		List<Mppsclass> stds=npjt.query(qry,gSPBM(null) , new Mappingrow());
		return stds;
	}

	@Override
	public void addMppsclass(Mppsclass Mppsclass) {
		// TODO Auto-generated method stub
		String qry="insert into mppsclass(classid,roomno)) values (:classid,:roomno)";
		npjt.update(qry, gSPBM(Mppsclass));
	}

	@Override
	public void updateMppsclass(Mppsclass Mppsclass) {
		// TODO Auto-generated method stub
		String qry="UPDATE mppsclass set roomno=:roomno where classid=:classid";
		npjt.update(qry, gSPBM(Mppsclass));
	}

	@Override
	public void deleteMppsclass(int id) {
		// TODO Auto-generated method stub

		String qry="DELETE FROM mppsclass WHERE classid=:classid";
		npjt.update(qry,gSPBM(new Mppsclass(id)));
	}

	@Override
	public Mppsclass findMppsclassById(int id) {
		// TODO Auto-generated method stub
		String qry="SELECT * FROM mppsclass WHERE classid=:classid";
		return npjt.queryForObject(qry,gSPBM(new Mppsclass(id)),new Mappingrow());
	
	}

}
