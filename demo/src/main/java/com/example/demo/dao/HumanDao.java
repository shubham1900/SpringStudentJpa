package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Human;

@Repository
public interface HumanDao extends JpaRepository<Human, Integer> 


{

}
