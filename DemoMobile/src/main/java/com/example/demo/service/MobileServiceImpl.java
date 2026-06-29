package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Mobile;
import com.example.demo.repository.MobileRepository;

@Service
public class MobileServiceImpl implements MobileService {

	@Autowired
	private MobileRepository mr;
	
	@Override
	public void add(Mobile m) {
		// TODO Auto-generated method stub
		mr.save(m);

	}

	@Override
	public List<Mobile> display() {
		// TODO Auto-generated method stub
		return mr.findAll();
	}

	@Override
	public void delete(int mobid) {
		// TODO Auto-generated method stub
		mr.deleteById(mobid);
	}

	@Override
	public Mobile update(int mobId, Mobile m) {
		// TODO Auto-generated method stub
		m.setMobId(mobId);
		return mr.save(m);
	}

}
