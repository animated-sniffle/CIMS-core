package com.interns.cims.entity;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Data
@Table(name = " lecture")
public class Lecture {
	@Id
	@Column (name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	
	@NotNull
	@ManyToOne
	private Subject subject;
	
	
	@NotNull
	@Column(name = "lectureDate", nullable = false)
	private LocalDateTime lectureDate;
	
	@Column(name = "description", nullable = true)
	private String description;
	
	@Column(name = "note", nullable = true)
	private String note;
	
	@NotNull
	@Column(name = "is_elective", nullable = false)
	private Boolean isElective;
	
	@NotNull
	@Column(name = "duration", nullable = false)
	private Double duration;
	
	@Column(name = "attendance")
	@OneToMany
	List<Student> attendance;
	
	@NotNull
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST})
	private Faculty faculty;
	
	@NotNull
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST})
	private Classroom classroom;
	
}
