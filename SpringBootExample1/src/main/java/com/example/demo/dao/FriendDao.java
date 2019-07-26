package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.FriendEntity;
import com.example.demo.friendRepository.FriendRepository;
import com.example.demo.pojo.FriendPojo;

@Repository("friendDao")
public class FriendDao {
	
	@Autowired
	private FriendRepository friendRepository;
	public List<FriendEntity> getAllFriends(){
		return (List<FriendEntity>) friendRepository.findAll();
	}
	
	public FriendPojo addFriend(FriendEntity fe) {
		FriendPojo friend = new FriendPojo();
		
		FriendEntity friendEntity = friendRepository.save(fe);
		friend.setId(friendEntity.getId());
		friend.setName(friendEntity.getName());
		friend.setLocation(friendEntity.getLocation());
		return friend;
	}
	
	public FriendEntity getFriendById(int id) {
		Optional<FriendEntity> f= friendRepository.findById((long)id);
		System.out.println("Inside DAO" + id);
		if (f.isPresent()) {
			return f.get();
		}else
			return null;
	}
}
