package com.office.portal.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
@Table(name = "ENQUIRY_DETAILS")
public class Enquiry {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ENQUIRY_ID")
	private Integer enquiryId;
	
	
	@NotNull
	@Column(name = "STUDENT_NAME")
	private String studentName;
	
	@Column(name = "STUDENT_CONTACT")
	private String studentContact;
	
	@NotNull
	@Column(name = "CLASS_MODE")
	private String classMode;
	
	@Column(name = "COURSE")
	private Long contactNumber;
	
	@NotNull
	@Column(name = "ENQUIRY_STATUS")
	private String EnquiryStatus;
	
	@NotNull
	@Column(name = "ENQUIRY_DATE")
	private LocalDate enquiryDate;
	
	@NotNull
	@Column(name = "LAST_UPDATED_DATE")
	private LocalDate lastUpdatedDate;
	
	@ManyToOne(targetEntity = User.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "USER_ID" , referencedColumnName = "USER_ID")
	private User user;
	
}
