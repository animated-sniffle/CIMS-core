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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Data
@Table(name = "faculty")
public class Faculty {
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
	@NotNull
	@Column(name = "email", nullable = false)
	private String email;
	
	@NotNull
	@Column(name = "phone", nullable = false)
	private String phone;
	
	@NotNull
	@Column(name = "alternate_phone", nullable = true)
	private String alternatePhone;
	
	@NotNull
	@Column(name = "date_Of_Birth", nullable = false)
	private Date dateOfBirth;
	
	@NotNull
	@Column(name = "gender", nullable = false)
	private String gender;
	
	@NotNull
	@OneToOne
	private Address address;
	
	@NotNull
	@OneToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST})
	private List<Subject> subjects;
	
	@OneToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,CascadeType.REMOVE})
	private AccountDetails accountDetails;
	
	@OneToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST}, mappedBy = "faculty")
	private List<Lecture> lectures;
	
	@ManyToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST}, mappedBy = "faculties")
	private List<Classroom> classes;
}
