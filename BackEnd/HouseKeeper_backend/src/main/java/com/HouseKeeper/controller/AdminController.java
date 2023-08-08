package com.HouseKeeper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HouseKeeper.entity.Admin;
import com.HouseKeeper.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	AdminService adminService;
	
	
	
	@GetMapping(path="/{id}", produces = "Application/json")
	private ResponseEntity<Admin> getAdmin(@PathVariable("id") int id) {
		return adminService.getAdmin(id);
	}
	
	@PostMapping(path="/addAdmin", consumes = "Application/json")
	private void addAdmin(@RequestBody Admin admin) {
		Admin admin1 = new Admin() ;
		admin1.setadmin_email(admin.getadmin_email());
		admin1.setadmin_name(admin.getadmin_name());
		admin1.setadmin_password(admin.getadmin_password());
		admin1.setEmpId(admin.getEmpId());
		
		adminService.addAdmin(admin1);
	}
}
