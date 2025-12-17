package com.cog.pract.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Challan")
public class Challan {
	

	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 private Long id;
	@Column(name="challan_id")
	private long challanId;
	@Column(name="numberplate")
	private String numberPlate;
	@Column(name="violation")
	private String violation;
	@Column(name="challan_issue_date")
	private LocalDate challanIssueDate;
	@Column(name="location")
	private String location;
	@Column(name="amount")
	private long amount;

	public Challan(long challanId, String numberPlate, String violation, LocalDate challanIssueDate, String location,long amount) {
		super();
		this.challanId = challanId;
		this.numberPlate = numberPlate;
		this.violation = violation;
		this.challanIssueDate = challanIssueDate;
		this.location = location;
		this.amount = amount;
	}
	public Challan() {
		super();
	}
	public long getChallanId() {
		return challanId;
	}
	public void setChallanId(long challanId) {
		this.challanId = challanId;
	}
	public String getNumberPlate() {
		return numberPlate;
	}
	public void setNumberPlate(String numberPlate) {
		this.numberPlate = numberPlate;
	}
	public String getViolation() {
		return violation;
	}
	public void setViolation(String violation) {
		this.violation = violation;
	}
	public LocalDate getChallanIssueDate() {
		return challanIssueDate;
	}
	public void setChallanIssueDate(LocalDate challanIssueDate) {
		this.challanIssueDate = challanIssueDate;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount=amount;
	}
	
	
	

}
