package com.tokoonlinebackendservice.entity.master;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.tokoonlinebackendservice.entity.BaseEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "MST_SELLER")
public class Seller extends BaseEntity {

	@Id
	@Column(name = "SELLER_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long sellerId;
	
	@Column(name = "SELLER_NAME")
	private String sellerName;
	
	@Column(name = "EFFECTIVE_START_DATE")
	private Timestamp effectiveStartDate;
	
	@Column(name = "EFFECTIVE_END_DATE")
	private Timestamp effectiveEndDate;
	
}
