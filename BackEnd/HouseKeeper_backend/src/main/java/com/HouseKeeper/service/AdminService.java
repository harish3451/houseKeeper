package com.HouseKeeper.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.HouseKeeper.entity.Admin;
import com.HouseKeeper.repository.AdminRepository;

@Service
public class AdminService {
	
	@Autowired
	AdminRepository adminRepository;
	
	
	public ResponseEntity<Admin> getAdmin(int id) {
		return new ResponseEntity<Admin>(this.adminRepository.findByEmpId(id),HttpStatusCode.valueOf(200));
	}
	
	public void addAdmin(Admin admin) {
		this.adminRepository.save(admin);
	}
}
