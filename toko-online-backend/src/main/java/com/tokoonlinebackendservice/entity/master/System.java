package com.tokoonlinebackendservice.entity.master;

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
@Table(name = "MST_SYSTEM")
public class System extends BaseEntity{

	@Id
	@Column(name = "SYSTEM_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long systemId;
	
	@Column(name = "SYSTEM_CODE")
	private String systemCode;
	
	@Column(name = "SYSTEM_VALUE")
	private String systemValue;
	
	@Column(name = "SYSTEM_DESCRIPTION")
	private String systemDescription;

	@Column(name = "STATUS")
	private String status;
	
}
