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
@Table(name = "address")
public class Address {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;

	@NotNull
	@Column(name = "street1", nullable = false)
	private String street1;

	@Column(name = "street2")
	private String street2;

	@NotNull
	@Column(name = "locality", nullable = false)
	private String locality;

	@NotNull
	@Column(name = "landmark", nullable = false)
	private String landMark;

	@NotNull
	@Column(name = "city", nullable = false)
	private String city;

	@NotNull
	@Column(name = "state", nullable = false)
	private String state;

	@NotNull
	@Column(name = "pincode", nullable = false)
	private Integer pincode;

	@NotNull
	@Column(name = "country", nullable = false)
	private String country;
}
