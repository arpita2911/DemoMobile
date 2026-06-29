package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Mobile;

public interface MobileService {

	void add(Mobile m);
	List<Mobile> display();
	void delete(int mobid);
	
	Mobile update(int mobId,Mobile m);
	
}
