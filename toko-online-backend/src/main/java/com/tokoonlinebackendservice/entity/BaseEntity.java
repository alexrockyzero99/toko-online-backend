package com.tokoonlinebackendservice.entity;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseEntity {

	private String createBy;
	private Timestamp createOn;
	private String updateBy;
	private Timestamp updateOn;
	private String recordFlag;
	
}
