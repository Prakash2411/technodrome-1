package com.example.restApi.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restApi.models.User;
import com.example.restApi.service.UserService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;



@CrossOrigin
@RestController
@RequestMapping("/employee")
public class UserController {
	
	@Autowired
	UserService userservise;
	
	@GetMapping("")
	public Iterable<User> getAllUser(){
		return this.userservise.getAll();
	}
	
	@GetMapping("/{id}")
	public Optional<User> getuserById(@PathVariable Integer id){
		return this.userservise.getById(id);
	}
	
	@PostMapping("")
	public String createuser(@RequestBody User user) {
		this.userservise.create(user);
		return "usre created successfully";
	}
	
	@PutMapping("/{id}")
	public String updateUser(@PathVariable Integer id, @RequestBody User user) {
		this.userservise.update(id, user);
		return "User Update Sucessfully";
	}
	
	@DeleteMapping("{id}")
	public String deleteUser(@PathVariable Integer id) {
		this.userservise.delete(id);
		return "User Deleted Sucessfully";
	}

}



















