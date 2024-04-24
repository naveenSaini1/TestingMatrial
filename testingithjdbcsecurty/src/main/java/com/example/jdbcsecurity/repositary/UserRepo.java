package com.example.jdbcsecurity.repositary;

import java.util.List;
import java.util.Map;

import com.example.jdbcsecurity.model.ResponseMessage;
import com.example.jdbcsecurity.model.User;

public interface UserRepo {
	public  Map<String, ResponseMessage<Integer>> insertTheUser(User user);
	public  Map<String,ResponseMessage<Integer>> updateTheUser(User user);
	public  Map<String,ResponseMessage<Integer>> deleteTheUser(User user);
	public  Map<String,ResponseMessage<Integer>> insertUserInBatch(List<User> user);
	public  Map<String,ResponseMessage<List<User>>> getAlltheUser();
	Map<String, ResponseMessage<List<User>>> getTheUserByEmail(User user);

	

}
