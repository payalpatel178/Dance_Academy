package com.johnabbott.project.dao;
import java.util.List;
import com.johnabbott.project.model.Admin;

public interface AdminDao {
	public List<Admin> getAdmins(); // READ

	public Admin getAdminById(int id);

	public Admin getAdminByUsername(String username);

	public boolean validateLogin(Admin admin);
}
