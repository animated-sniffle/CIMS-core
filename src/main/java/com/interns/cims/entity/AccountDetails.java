package com.interns.cims.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "account_details")
public class AccountDetails {
	
	@Id
	@Column (name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;

	@NotNull
	@Column(name = "accountHolderName", nullable = false)
	private String accountHolderName;
	
	@NotNull
	@Column(name = "accountNumber", nullable = false)
	private Long accountNumber;
	
	@NotNull
	@Column(name = "ifscCode", nullable = false)
	private String ifscCode;
	
	
}
