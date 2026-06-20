package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Mobile;
import com.example.demo.service.MobileService;

@RestController
public class MobileController {

	@Autowired
	private MobileService ms;
	
	@GetMapping("display")
	public List<Mobile> displayMobiles(){
		return ms.display();
	}
	
	@PostMapping("add")
	public void addMobile(Mobile m) {
		ms.add(m);
	}
}
