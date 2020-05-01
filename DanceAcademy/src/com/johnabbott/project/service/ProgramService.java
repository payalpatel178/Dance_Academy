package com.johnabbott.project.service;

import java.util.List;
import com.johnabbott.project.model.ProgramEntity;

public interface ProgramService {
	public boolean addProgram(ProgramEntity prg);

	public List<ProgramEntity> getPrograms(); // Read

	public ProgramEntity getProgramById(int programId); // Read

	public boolean deleteProgram(int programId); // DELETE

	public boolean updateProgram(ProgramEntity prg); // UPDATE
}
