package com.johnabbott.project.service;

import java.util.List;

import com.johnabbott.project.model.Admin;

public interface AdminService {
	public List<Admin> getAdmins(); // READ

	public Admin getAdminById(int id);

	public boolean validateLogin(Admin admin); // Check that username & password are correct
}
