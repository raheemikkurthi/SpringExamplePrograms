package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.FriendEntity;
import com.example.demo.pojo.FriendPojo;
import com.example.demo.service.FriendService;

@RestController
@RequestMapping("/controller")
public class SpringBootController {

	@Autowired 
	private FriendService friendservice;
	
	
	@RequestMapping("/app")
	public String getMessage() {
		return "SpringBootController";
	}
	//@RequestMapping(value = "/all", method = {RequestMethod.GET, RequestMethod.POST })
	@GetMapping("/all")
	public List<FriendEntity> getAllFriends() {
		return friendservice.getAllFriends();
	}
	
	//@RequestMapping(value = "/add", method = RequestMethod.POST)
	@PostMapping("/add")
	public FriendPojo addFriend(@RequestBody FriendEntity fe) {
		System.out.println(fe.toString());
		return friendservice.addFriend(fe);
	}
	
	@GetMapping("/get/{id}")
	public FriendEntity getFriendById(@PathVariable int id) {
		System.out.println("Inside Controller" + id);
		return friendservice.getFriendById(id);
	}
	
	
	
	
	
	//@PostMapping
	/*
	 * @RequestMapping(value = "/update/{id}", method = RequestMethod.POST) public
	 * FriendEntity updateFriend(int id, FriendEntity fe) { return null; }
	 * 
	 * @DeleteMapping("/delete/{id}") public List<FriendEntity> deleteFriend() {
	 * return null; }
	 */
	
	/*
	 * @GetMapping("/name/{friendName}") public FriendEntity getFriendByName(String
	 * name) { return null; }
	 */
	
	
}
