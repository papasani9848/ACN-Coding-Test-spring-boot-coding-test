package com.accenture.codingtest.springbootcodingtest.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.accenture.codingtest.springbootcodingtest.entity.User;

@Transactional
@Repository
public interface UserRepo extends JpaRepository<User, Long>{

}
