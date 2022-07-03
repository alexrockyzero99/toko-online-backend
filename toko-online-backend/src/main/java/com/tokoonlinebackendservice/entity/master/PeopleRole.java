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
@Table(name = "MST_PEOPLE_ROLE_RESPONSIBILITY")
public class PeopleRole extends BaseEntity {

	@Id
	@Column(name = "PEOPLE_RESPONSIBILITY_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long peopleResponsibilityId;
	
	@ManyToOne
	@JoinColumn(name = "PEOPLE_ID")
	private People people;
	
	@ManyToOne
	@JoinColumn(name = "RESPONSIBILITY_ID")
	private Responsibility responsibility;
	
}
