package com.example.restApi.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.restApi.models.User;

public interface UserRepo extends CrudRepository<User, Integer> {

}
