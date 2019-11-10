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

import com.school.MPPS.Model.Mppsstaff;

@Repository
public class Mppsstaffdaoimpl implements Mppsstaffdao{		
		NamedParameterJdbcTemplate npjt;
		@Autowired
		public void setNameParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) 
		{
		this.npjt = namedParameterJdbcTemplate ;
		}
		
		private static final class Mappingrow implements RowMapper<Mppsstaff>
		{
			public Mppsstaff mapRow(ResultSet rs,int rowNum) throws SQLException
			   {
				   Mppsstaff Sd=new Mppsstaff();
				   Sd.setStaffid(rs.getInt("staffid"));
				   Sd.setStname(rs.getString("stname"));
				   Sd.setStaffphone(rs.getString("staffphone"));
				   Sd.setWork(rs.getString("work"));
				   Sd.setGender(rs.getString("gender"));
				   return Sd;
				   
			   }
		}
		
		private SqlParameterSource gSPBM(Mppsstaff Sd)
		   {
			   MapSqlParameterSource paramSource =new MapSqlParameterSource();
			   if(Sd!= null)
			   {
				   paramSource.addValue("staffid", Sd.getStaffid());
				   paramSource.addValue("stname", Sd.getStname());
				   paramSource.addValue("work", Sd.getWork());
				   paramSource.addValue("staffphone", Sd.getStaffphone());
				   paramSource.addValue("gender", Sd.getGender());
				   
			   }
			   
			   
			   return paramSource;
		   }

		@Override
		public List<Mppsstaff> Listallstaffs() {
			// TODO Auto-generated method stub
			String qry="SELECT * FROM mppsstaff";
			List<Mppsstaff> stds=npjt.query(qry,gSPBM(null) , new Mappingrow());
			return stds;
		}

		@Override
		public void addMppsstaff(Mppsstaff Mppsstaff) {
			// TODO Auto-generated method stub
			String qry="insert into mppsstaff(staffid,stname,work,staffphone,gender) values (:staffid,:stname,:work,:staffphone,:gender)";
			npjt.update(qry, gSPBM(Mppsstaff));
		}

		@Override
		public void updateMppsstaff(Mppsstaff Mppsstaff) {
			// TODO Auto-generated method stub
			String qry="UPDATE mppsstaff set stname=:stname,work=:work,staffphone=:staffphone,gender=:gender where staffid=:staffid";
			npjt.update(qry, gSPBM(Mppsstaff));
			
		}

		@Override
		public void deleteMppsstaff(int id) {
			// TODO Auto-generated method stub
			String qry="DELETE FROM mppsstaff WHERE staffid=:staffid";
			npjt.update(qry,gSPBM(new Mppsstaff(id)));
		}

		@Override
		public Mppsstaff findMppsstaffById(int id) {
			// TODO Auto-generated method stub
			String qry="SELECT * FROM mppsstaff WHERE staffid=:staffid";
			return npjt.queryForObject(qry,gSPBM(new Mppsstaff(id)),new Mappingrow());
		
		}
		
}
