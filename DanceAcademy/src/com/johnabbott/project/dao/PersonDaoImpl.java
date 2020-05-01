package com.johnabbott.project.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.johnabbott.project.model.PersonEntity;

public class PersonDaoImpl implements PersonDao{

	JdbcTemplate jdbcTemplate;

	private final String SQL_INSERT_PERSON = "insert into "
			+ "person(firstName, lastName, age, email, phone, programName) values(?, ?, ? ,? ,? ,?)";

	public PersonDaoImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	@Override
	public int insertPerson(PersonEntity person) {
		return jdbcTemplate.update(SQL_INSERT_PERSON, person.getFirstName(), person.getLastName(), person.getAge(), person.getEmail(), person.getPhone(), person.getProgramName());
	}

}
