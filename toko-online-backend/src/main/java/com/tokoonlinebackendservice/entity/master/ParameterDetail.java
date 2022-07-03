package com.tokoonlinebackendservice.entity.master;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.tokoonlinebackendservice.entity.BaseEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "MST_PARAMETER_DETAIL")
public class ParameterDetail extends BaseEntity {

	@Id
	@Column(name = "PARAMETER_DETAIL_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long parameterDetailId;
	
	@ManyToOne
	@JoinColumn(name = "PARAMETER_ID")
	private Parameter parameter;
	
	@Column(name = "DETAIL_CODE")
	private String detailCode;
	
	@Column(name = "DETAIL_VALUE")
	private String detailValue;
	
	@Column(name = "DETAIL_DESCRIPTION")
	private String detailDescription;
	
	@Column(name = "STATUS")
	private String status;
	
	@Column(name = "CODE")
	private String code;
	
	@Column(name = "SEQUENCE")
	private Integer sequence;
	
}
