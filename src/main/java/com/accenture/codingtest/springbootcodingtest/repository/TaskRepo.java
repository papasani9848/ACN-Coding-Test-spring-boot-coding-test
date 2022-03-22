package com.accenture.codingtest.springbootcodingtest.repository;

import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.accenture.codingtest.springbootcodingtest.entity.Task;


	@Transactional
	@Repository
	public interface TaskRepo extends JpaRepository<Task, Long>{

	}

