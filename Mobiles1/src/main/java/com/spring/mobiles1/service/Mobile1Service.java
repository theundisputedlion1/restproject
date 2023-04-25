package com.spring.mobiles1.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mobiles1.model.Mobiles1;
import com.spring.mobiles1.repository.Mobile1Repository;

@Service
public class Mobile1Service {
	@Autowired
	private Mobile1Repository mr;
	
	public List<Mobiles1> mobileDetail(){
		return mr.findAll();
	}
	
	public Mobiles1 saveDetail(Mobiles1 s){
		return mr.save(s);
	}
	
	public Mobiles1 updateDetail(Mobiles1 r){
		return mr.save(r);
	}
	
	public void delete(int id){
		 mr.deleteById(id);
	}
	
	



}
