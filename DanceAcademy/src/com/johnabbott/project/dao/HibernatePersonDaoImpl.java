package com.johnabbott.project.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.johnabbott.project.model.PersonEntity;

@Repository
public class HibernatePersonDaoImpl implements PersonDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public int insertPerson(PersonEntity per) {
		sessionFactory.getCurrentSession().save(per);
		return 1;
	}
	protected Session getSession(){
		return sessionFactory.getCurrentSession();
	}

}
