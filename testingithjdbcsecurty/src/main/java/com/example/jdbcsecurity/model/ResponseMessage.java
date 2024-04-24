package com.example.jdbcsecurity.model;

import com.example.jdbcsecurity.enums.ResponseType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ResponseMessage <T>{
	
	private ResponseType responseType;
	private String message;
	private T data;
	

}
