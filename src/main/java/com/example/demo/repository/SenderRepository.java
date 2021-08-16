package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.SenderEntity;

public interface SenderRepository extends JpaRepository<SenderEntity, Long>{
		
}
