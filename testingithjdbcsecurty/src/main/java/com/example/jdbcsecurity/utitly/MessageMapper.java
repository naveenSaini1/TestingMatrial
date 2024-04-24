package com.example.jdbcsecurity.utitly;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.example.jdbcsecurity.enums.ResponseType;
import com.example.jdbcsecurity.model.ResponseMessage;

@Component
public class MessageMapper {
	
	public <T> Map<String, ResponseMessage<T>> mapperForResponseMessage(ResponseMessage<T> responseMessage){
		Map<String,ResponseMessage<T>>		response			=		new HashMap<>();;
		ResponseMessage	<T>		needToAddInResponse			=		responseMessage;
			response.put(ResponseType.RESPONSE.toString(), needToAddInResponse);
			return response;
		
	}
	
	

}
