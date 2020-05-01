package com.johnabbott.project.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.johnabbott.project.model.ProgramEntity;

public class ProgramDaoImpl implements ProgramDao {

	JdbcTemplate jdbcTemplate;

	private final String SQL_INSERT_PROGRAM = "insert into "
			+ "programs(name, duration, stratingDate, fees) values(?, ?, ? ,?)";

	private final String SQL_UPDATE_PROGRAM = "update programs set name= ? , duration =? , stratingDate = ? , fees = ?  where id = ? ";

	private final String SQL_SELECT_PROGRAM = "select id, name, duration, stratingDate, fees" + " from programs";

	private final String SQL_SELECT_PROGRAM_BY_ID = "select id, name, duration, stratingDate, fees from programs where id = ?";

	private final String SQL_DELETE_PROGRAM = "delete from programs where id = ? ";

	public ProgramDaoImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public int insertProgram(ProgramEntity prg) {
		return jdbcTemplate.update(SQL_INSERT_PROGRAM, prg.getName(), prg.getDuration(), prg.getStartingDate(),
				prg.getFees());
	}

	@Override
	public List<ProgramEntity> getPrograms() {
		return jdbcTemplate.query(SQL_SELECT_PROGRAM, new ProgramMapper());
	}

	@Override
	public ProgramEntity getProgramById(int programId) {
		return jdbcTemplate.queryForObject(SQL_SELECT_PROGRAM_BY_ID, new
		Object[]{programId}, new ProgramMapper());
	}

	@Override
	public ProgramEntity getProgramByName(String programName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteProgram(int programId) {
		int deleteResult = jdbcTemplate.update(SQL_DELETE_PROGRAM, programId);
		return deleteResult > 0;
	}

	@Override
	public boolean updateProgram(ProgramEntity prg) {
		int updateResult = jdbcTemplate.update(SQL_UPDATE_PROGRAM, prg.getName(), prg.getDuration(),
				prg.getStartingDate(), prg.getFees(), prg.getId());
		return updateResult > 0;
	}

}
