package com.johnabbott.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.johnabbott.project.dao.AdminDao;
import com.johnabbott.project.model.Admin;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminDao adminDao;

	public AdminServiceImpl() {
	}

	@Override
	public List<Admin> getAdmins() {
		return adminDao.getAdmins();
	}

	@Override
	public Admin getAdminById(int id) {
		return adminDao.getAdminById(id);
	}
	@Override
	public boolean validateLogin(Admin admin) {
		return adminDao.validateLogin(admin);
	}

}
