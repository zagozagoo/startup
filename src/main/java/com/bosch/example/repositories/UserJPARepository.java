package com.bosch.example.repositories;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bosch.example.model.User;

@Repository
public interface UserJPARepository 
    extends JpaRepository<User, Long> {

    List<User> findByCountry(String country);
    List<User> findByUsernameContaining(String name);
}