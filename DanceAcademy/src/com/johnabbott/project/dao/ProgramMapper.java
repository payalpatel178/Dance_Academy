package com.johnabbott.project.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.johnabbott.project.model.ProgramEntity;

public class ProgramMapper implements RowMapper<ProgramEntity> {

	@Override
	public ProgramEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new ProgramEntity(rs.getInt("id"), rs.getString("name"), rs.getString("duration"),
				rs.getString("startingDate"), rs.getDouble("fees"));
	}

}
