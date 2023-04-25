package com.spring.mobiles1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mobiles1.model.Mobiles1;
import com.spring.mobiles1.service.Mobile1Service;

@RestController
public class Mobile1Controller {
	@Autowired
    Mobile1Service ms;
	
	@GetMapping("/get")
	public List<Mobiles1> mobileDetail()
	{
		return ms.mobileDetail();
	}
	
	@PostMapping("/save")
	public Mobiles1 saveDetail(@RequestBody Mobiles1 s){
		return ms.saveDetail(s);
	}
	
	@PutMapping("/update")
	public Mobiles1 updateDetail(@RequestBody Mobiles1 r){
		return ms.updateDetail(r);
	}
	
	@DeleteMapping("/update/{id}")
	public String delete(@PathVariable int id){
		 ms.delete(id);
		 return "Deleted";
	}
	
	
	
	

}
