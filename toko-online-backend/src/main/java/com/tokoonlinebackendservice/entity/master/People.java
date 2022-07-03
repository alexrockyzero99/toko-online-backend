package com.tokoonlinebackendservice.entity.master;

import java.sql.Timestamp;
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
@Table(name = "MST_PEOPLE")
public class People extends BaseEntity {

	@Id
	@Column(name = "PEOPLE_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long peopleId;
	
	@Column(name = "FULL_NAME")
	private String fullName;
	
	@Column(name = "IDENTITY_CARD")
	private String identityCard;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "MOBILE")
	private String mobilePhone;
	
	@Column(name = "DATE_OF_BIRTH")
	private Timestamp dateOfBirth;
	
	@Column(name = "PLACE_OF_BIRTH")
	private String placeOfBirth;
	
	@Column(name = "PASSWORD")
	private String password;
	
	@Column(name = "PEOPLE_NUMBER")
	private String peopleNumber;
	
	@Column(name = "ADDRESS")
	private String address;
	
	@Column(name = "GENDER")
	private String gender;
	
	@Column(name = "USERNAME")
	private String username;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "people", orphanRemoval = true)
	@OrderBy("peopleResponsibilityId")
	private List<PeopleRole> peopleRoleList;
	
}
