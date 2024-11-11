package com.spring.jdbc.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entities.Employee;

public class RawMapperImpl implements RowMapper<Employee>{

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee e=new Employee();
		e.setEid(rs.getInt(1));
		e.setEname(rs.getString(2));
		e.setDname(rs.getString(3));
		
		return e;
		
	}

}
