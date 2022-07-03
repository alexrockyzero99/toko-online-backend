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
@Table(name = "MST_RESPONSIBILITY_DETAIL")
public class ResponsibilityDetail extends BaseEntity {

	@Id
	@Column(name = "RESPONSIBILITY_DETAIL_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long responsibilityDetailId;
	
	@ManyToOne
	@JoinColumn(name = "RESPONSIBILITY_ID")
	private Responsibility responsibility;
	
	@ManyToOne
	@JoinColumn(name = "MENU_ID")
	private Menu menu;
	
}
