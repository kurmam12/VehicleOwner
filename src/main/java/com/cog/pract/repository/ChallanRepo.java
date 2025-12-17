package com.cog.pract.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cog.pract.model.Challan;



public interface ChallanRepo extends JpaRepository<Challan, Long>{
	
}
