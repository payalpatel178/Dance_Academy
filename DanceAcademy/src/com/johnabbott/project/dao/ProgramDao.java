package com.johnabbott.project.dao;

import java.util.List;

import com.johnabbott.project.model.ProgramEntity;

public interface ProgramDao {

	public int insertProgram(ProgramEntity prg); // Create

	public List<ProgramEntity> getPrograms(); // Read

	public ProgramEntity getProgramById(int programId); // Read

	public ProgramEntity getProgramByName(String programName); // Read

	public boolean deleteProgram(int programId); // DELETE

	public boolean updateProgram(ProgramEntity prg); // UPDATE
}
