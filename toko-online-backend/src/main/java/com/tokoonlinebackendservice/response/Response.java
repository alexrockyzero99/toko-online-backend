package com.tokoonlinebackendservice.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Response<T> {
	
    private String status;
    private String message;
    private String messageInfo;
    private T data;
    private Number countData;
	
}
