package com.tokoonlinebackendservice.entity.master;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

import com.tokoonlinebackendservice.entity.BaseEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "MST_RESPONSIBILITY")
public class Responsibility extends BaseEntity {

	@Id
	@Column(name = "RESPONSIBILITY_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long responsibilityId;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "DESCRIPTION")
	private String description;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "responsibility", orphanRemoval = true)
	@OrderBy("responsibilityDetailId")
	private List<ResponsibilityDetail> responsibilityDetailList;
	
}
