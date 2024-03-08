package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Batch;


public interface BatchRepository extends JpaRepository<Batch, Integer>{

}
