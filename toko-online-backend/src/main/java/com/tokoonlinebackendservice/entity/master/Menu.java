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
@Table(name = "MST_MENU")
public class Menu extends BaseEntity {

	@Id
	@Column(name = "MENU_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long menuId;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "ACTION")
	private String action;
	
	@Column(name = "PARENT_ID")
	private Long parentId;
	
	@Column(name = "FONTAWESOME")
	private String fontawesome;
	
	@Column(name = "DESCRIPTION")
	private String description;
	
	@Column(name = "MENU_LEVEL")
	private Integer menuLevel;
	
	@Column(name = "MENU_ORDER")
	private Integer menuOrder;
	
	@Column(name = "MENU_TYPE")
	private String menuType;
	
}
