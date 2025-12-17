package com.cog.pract.controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cog.pract.model.Challan;
import com.cog.pract.service.ChallanService;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/challan")
public class ChallanController {
	
	private ChallanService challanService;

	public ChallanController(ChallanService challanService) {
		super();
		this.challanService = challanService;
	}
	
	@GetMapping("/getById/{id}")
	public Optional<Challan> gebyId(@PathVariable("id")Long id){
		return challanService.getChallanDetails(id);
		
	}

}
