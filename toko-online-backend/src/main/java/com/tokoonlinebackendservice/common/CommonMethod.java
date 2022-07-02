package com.tokoonlinebackendservice.common;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.apache.tika.Tika;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import com.tokoonlinebackendservice.response.LoginResponse;
import com.tokoonlinebackendservice.response.Response;
import com.tokoonlinebackendservice.vo.UserInfo;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import io.jsonwebtoken.Jwts;

public class CommonMethod {

	
	private CommonMethod() {
	    throw new IllegalStateException("Utility class");
	}
	
	public static String objectToJson(Object obj) {
        Class<?> classObj = obj.getClass();
        Map<String, Object> values = new HashMap<>();

        try {
            for (Field field : classObj.getDeclaredFields()) {
                field.setAccessible(true);
                String fieldString = field.getName();

                values.put(fieldString, field.get(obj));
            }

        } catch (IllegalAccessException e){
            e.printStackTrace();
        }

        Gson gson = new Gson();
        Type gsonType = new TypeToken<>(){}.getType();
        
        return gson.toJson(values, gsonType);

    } 
	
	public static UserInfo JsonToObject(String response) {
    	Gson gson = new Gson();
    	@SuppressWarnings("deprecation")
		JsonParser parser = new JsonParser();
    	@SuppressWarnings("deprecation")
		JsonObject object = (JsonObject) parser.parse(response);// response will be the json String
    	UserInfo emp = gson.fromJson(object, UserInfo.class); 
    	return emp;
    }
	
	@SuppressWarnings("rawtypes")
	public static LoginResponse jsonToLoginResponse(String response) {
    	Gson gson = new Gson();
    	JsonObject object = JsonParser.parseString(response).getAsJsonObject();
    	return gson.fromJson(object, LoginResponse.class); 
    	
    }
	
	public static UserInfo jsonToObjectInfo(String response) {
    	Gson gson = new Gson();
    	JsonObject object = JsonParser.parseString(response).getAsJsonObject();
    	return gson.fromJson(object, UserInfo.class); 
    	
    }
	
	public static Object getUserInfo(String token,String secret,String prefix) {
		if (token != null) {
			// parse the token.
			return Jwts.parser().setSigningKey(secret.getBytes()).parseClaimsJws(token.replace(prefix, "")).getBody().getSubject();
		}
		
		return null;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static ResponseEntity<Response> badRequest(String message) {
		Response response = new Response();
		response.setStatus("0");
		response.setMessage(message);
		response.setData(null);
		
		return  ResponseEntity.status(HttpStatus.BAD_REQUEST).contentType(MediaType.APPLICATION_JSON).body(response);
	}
	
	public static String getMimeType(byte[] data) throws Exception {
		return new Tika().detect(data);
	}
}
