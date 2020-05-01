package com.johnabbott.project.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "programs")
public class ProgramEntity {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "name", nullable = false, unique = true)
	private String name;
	
	@Column(name = "duration")
	private String duration;
	
	@Column(name = "startingDate")
	private String startingDate;
	
	@Column(name = "fees")
	private double fees;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "instructor_id")
	private InstructorEntity instructor;
	
	public ProgramEntity() {
		
	}
	
	public ProgramEntity(int id, String name, String duration, String startingDate, double fees) {
		this.id = id;
		this.name = name;
		this.duration = duration;
		this.startingDate = startingDate;
		this.fees= fees;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getStartingDate() {
		return startingDate;
	}

	public void setStartingDate(String startingDate) {
		this.startingDate = startingDate;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public InstructorEntity getInstructor() {
		return instructor;
	}

	public void setInstructor(InstructorEntity instructor) {
		this.instructor = instructor;
	}
	

}
