package com.johnabbott.project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.johnabbott.project.dao.PersonDao;
import com.johnabbott.project.model.PersonEntity;

@Service
@Transactional
public class PersonServiceImpl implements PersonService{

	@Autowired
	PersonDao personDao;

	List<PersonEntity> listPersons;

	public PersonServiceImpl() {
		listPersons = new ArrayList<PersonEntity>();

		listPersons.add(new PersonEntity(1, "firstname1", "lastname1", 25, "aaa@gmail.com","123 456-7890","acro dance"));
		listPersons.add(new PersonEntity(2, "firstname2", "lastname2", 25, "aaa@gmail.com","123 456-7890","acro dance"));
		
	}

	@Override
	public boolean addPerson(PersonEntity per) {
		return personDao.insertPerson(per) > 0;
	}

}
