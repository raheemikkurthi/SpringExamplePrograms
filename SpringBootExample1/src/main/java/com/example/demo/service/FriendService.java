package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.FriendDao;
import com.example.demo.entity.FriendEntity;
import com.example.demo.pojo.FriendPojo;

@Service("friendservice")
public class FriendService {

	@Autowired
	private FriendDao friendDao;
	public List<FriendEntity> getAllFriends() {
		 return friendDao.getAllFriends();
	}
	
	
	public FriendPojo addFriend(FriendEntity fe) {
		System.out.println("Inside Service" + fe.toString());
		return friendDao.addFriend(fe);
	}
	
	public FriendEntity getFriendById(int id) {
		
		return friendDao.getFriendById(id);
	}
}
