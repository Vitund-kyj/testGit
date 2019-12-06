package com.bit.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserRowMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		User user = new User();
		user.setRole(rs.getString("role"));
		user.setName(rs.getString("name"));
		user.setPassword(rs.getString("password"));
		user.setId(rs.getString("id"));
		return user;
	}

}













