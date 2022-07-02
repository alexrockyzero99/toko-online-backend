package com.tokoonlinebackendservice.vo;

import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserInfo {

	private String userName;
	private String userId;
	private String name;
	private String nik;
	private String email;
	private Long internalId;
	private String initial;
	
	Map<Long, String> userRespon;
	
	public UserInfo(String userName, String userId, String name, String nik, String email, Long internalId, String initial, Map<Long, String> userRespon) {
		this.userName = userName;
		this.userId = userId;
		this.name = name;
		this.nik = nik;
		this.email = email;
		this.internalId = internalId;
		this.initial = initial;
		this.userRespon = userRespon;
	}

}
