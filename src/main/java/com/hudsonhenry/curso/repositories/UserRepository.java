package com.hudsonhenry.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hudsonhenry.curso.entites.User;


public interface UserRepository extends JpaRepository<User,Long> {

}
