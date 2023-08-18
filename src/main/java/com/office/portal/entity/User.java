package com.office.portal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="USER_DETAILS")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USER_ID")
	private Integer userId;
	
	
	@NotNull
	@Column(name = "EMAIL" , unique = true)
	private String email;
	
	@Column(name = "NAME")
	private String name;
	
	@NotNull
	@Column(name = "PASSWORD")
	private String password;
	
	@Column(name = "CONTACT_NUMBER")
	private Long contactNumber;
	
	@NotNull
	@Column(name = "ACCOUNT_STATUS")
	private String accountStatus;

}
