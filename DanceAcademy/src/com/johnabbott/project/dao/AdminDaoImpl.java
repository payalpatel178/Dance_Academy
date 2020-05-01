package com.johnabbott.project.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import com.johnabbott.project.model.Admin;

@Repository
public class AdminDaoImpl implements AdminDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	protected Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public List<Admin> getAdmins() {
		return getSession().createQuery("from Admin", Admin.class).list();
	}

	@Override
	public Admin getAdminById(int id) {
		return (Admin) getSession().get(Admin.class, id);
	}
	
	@Override
	public Admin getAdminByUsername(String username) {
		String hql="from Admin a where a.username = :username";
		return (Admin) getSession().createQuery(hql).setParameter("username", username).uniqueResult();
	}

	@Override
	public boolean validateLogin(Admin admin) {
		Admin selectedAdmin = getAdminByUsername(admin.getUsername());
		String correctPassword = selectedAdmin.getPassword();
		String submittedPassword = admin.getPassword();
		if (correctPassword.equals(submittedPassword))
			return true;
		else
			return false;
	}
	
}
