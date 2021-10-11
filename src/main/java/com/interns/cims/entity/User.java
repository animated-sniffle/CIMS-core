package com.interns.cims.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Data
@Table(name = "users")
public class User {

	@Id
	@Column (name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	
	@NotNull
	@Column(name = "username", nullable = false)
	private String username;
	
	@NotNull
	@Column(name = "password", nullable = false)
	private String password;
	
	@NotNull
	@Column(name = "enabled", nullable = false)
	private int enabled;
}
