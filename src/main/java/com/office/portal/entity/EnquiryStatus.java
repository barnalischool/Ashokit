package com.office.portal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
@Table(name = "ENQUIRY_STATUS")
public class EnquiryStatus {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ENQUIRY_STATUS_ID")
	private Integer EnquiryStatusId;
	
	@NotNull
	@Column(name = "ENQUIRY_STATUS")
	private String enquiryStatus;

}
