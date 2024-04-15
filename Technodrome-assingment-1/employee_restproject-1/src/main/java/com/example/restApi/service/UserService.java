package com.example.restApi.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restApi.models.User;
import com.example.restApi.repo.UserRepo;

@Service
public class UserService {
	
	@Autowired
	UserRepo userrepo;
	
	public User create(User user) {
		return userrepo.save(user);
	}
	
	public Iterable<User> getAll(){
		return this.userrepo.findAll();
	}
	
	public Optional<User> getById(Integer id){
		return this.userrepo.findById(id);
		
	}
	
	public User update(Integer id, User user) {
		getById(id);
		user.setEmployee_ID(id);
		return this.userrepo.save(user);	
	}
	
	public Optional<User> delete(Integer id){
		Optional<User> user= getById(id);
		this.userrepo.deleteById(id);
		return user;
	}
	
	
	

}
