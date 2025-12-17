package com.cog.pract.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cog.pract.model.Challan;
import com.cog.pract.repository.ChallanRepo;

import reactor.core.publisher.Mono;

@Service
public class ChallanService {
	
	
	private ChallanRepo challanRep;

	public ChallanService(ChallanRepo challanRep) {
		super();
		this.challanRep = challanRep;
	}
	
	public Optional<Challan> getChallanDetails(Long id) {
		return challanRep.findById(id);
	}
		

}
