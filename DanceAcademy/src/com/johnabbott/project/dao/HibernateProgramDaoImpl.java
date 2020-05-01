package com.johnabbott.project.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.johnabbott.project.model.ProgramEntity;

@Repository
public class HibernateProgramDaoImpl implements ProgramDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public int insertProgram(ProgramEntity prg) {
		sessionFactory.getCurrentSession().save(prg);
		sessionFactory.getCurrentSession().save(prg.getInstructor());
		return 1;
	}

	@Override
	public List<ProgramEntity> getPrograms() {
		//Program is not the table name => it is the class name(@Entity)
				return getSession().createQuery("from ProgramEntity", ProgramEntity.class).list();
	}

	@Override
	public ProgramEntity getProgramById(int programId) {
		return (ProgramEntity) getSession().get(ProgramEntity.class, programId);
	}

	@Override
	public ProgramEntity getProgramByName(String programName) {
		String hql = "from ProgramEntity where name= :program_name";
		Query query = getSession().createQuery(hql);
		query.setParameter("program_name",programName);
		if (query.list().size() > 0) {
			return (ProgramEntity)query.list().get(0);
		}
		else {
			return null;
		}
	}

	@Override
	public boolean deleteProgram(int programId) {
		ProgramEntity fetchedProgram = getProgramById(programId);
		getSession().delete(fetchedProgram);
		return true;
	}

	@Override
	public boolean updateProgram(ProgramEntity prg) {
		getSession().update(prg);
		return true;
	}
	
	protected Session getSession(){
		return sessionFactory.getCurrentSession();
	}

}
