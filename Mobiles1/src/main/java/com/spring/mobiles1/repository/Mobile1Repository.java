package com.spring.mobiles1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.mobiles1.model.Mobiles1;

@Repository
public interface Mobile1Repository extends JpaRepository<Mobiles1,Integer> {
      
}
