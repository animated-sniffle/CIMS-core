package com.interns.cims.entity;

import java.sql.Date;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Data
@Table(name = "Student")
public class Student {
	
	@Id
	@Column (name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	
	@NotNull
	@Column(name = "username", nullable = false)
	private String username;
	
	@NotNull
	@Column(name = "first_name", nullable = false)
	private String firstName;
	
	@Column(name = "middle_name", nullable = true)
	private String middleName;
	
	@NotNull
	@Column(name = "last_name", nullable = false)
	private String lastName;
	
	@Email
	@Column(name = "student_email", nullable = true)
	private String studentEmail;
	
	@Column(name = "student_phone", nullable = true)
	private String studentPhone;
	
	@Email
	@Column(name = "father_email", nullable = true)
	private String fatherEmail;
	
	@NotNull
	@Column(name = "father_phone", nullable = false)
	private String fatherPhone;
	
	@Email
	@Column(name = "mother_email", nullable = true)
	private String motherEmail;
	
	@Column(name = "mother_phone", nullable = false)
	private String motherPhone;
	
	@NotNull
	@Column(name = "date_Of_Birth", nullable = false)
	private Date dateOfBirth;
	
	@NotNull
	@Column(name = "gender", nullable = false)
	private String gender;
	
	@NotNull
	@OneToOne
	private Address address;
	
	@ManyToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST})
	private List<Lecture> lectures;
	
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST})
	private Classroom classroom;
}
