package com.johnabbott.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="instructor")
public class InstructorEntity {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="instructor_id")
	private int instructor_id;
	
	@Column(name = "name")
	private String name;
	
	public InstructorEntity() {
	}

	public int getInstructor_id() {
		return instructor_id;
	}

	public void setInstructor_id(int instructor_id) {
		this.instructor_id = instructor_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
