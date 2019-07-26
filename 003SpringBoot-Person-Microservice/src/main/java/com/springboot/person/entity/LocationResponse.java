package com.springboot.person.entity;

import lombok.Data;

@Data
public class LocationResponse {
	private String personCode;
	private Long latitude;
	private Long longitude;
}
