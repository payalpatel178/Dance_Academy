package com.johnabbott.project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.johnabbott.project.dao.ProgramDao;
import com.johnabbott.project.model.ProgramEntity;

@Service
@Transactional
public class ProgramServiceImpl implements ProgramService {

	@Autowired
	ProgramDao programDao;

	List<ProgramEntity> listPrograms;

	public ProgramServiceImpl() {
		listPrograms = new ArrayList<ProgramEntity>();

		listPrograms.add(new ProgramEntity(1, "prg1", "6 months", "10-10-2019", 500));
		listPrograms.add(new ProgramEntity(2, "prg2", "6 months", "10-10-2019", 500));
		listPrograms.add(new ProgramEntity(3, "prg3", "6 months", "10-10-2019", 500));
		listPrograms.add(new ProgramEntity(4, "prg4", "6 months", "10-10-2019", 500));
	}

	@Override
	public boolean addProgram(ProgramEntity prg) {
		return programDao.insertProgram(prg) > 0;
	}

	@Override
	public List<ProgramEntity> getPrograms() {
		return programDao.getPrograms();
	}

	@Override
	public ProgramEntity getProgramById(int programId) {
		return programDao.getProgramById(programId);
	}

	@Override
	public boolean deleteProgram(int programId) {
		return programDao.deleteProgram(programId);
	}

	@Override
	public boolean updateProgram(ProgramEntity prg) {
		return programDao.updateProgram(prg);
	}

}
