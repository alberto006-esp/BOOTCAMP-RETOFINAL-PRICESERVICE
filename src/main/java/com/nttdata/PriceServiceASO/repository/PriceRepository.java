package com.nttdata.PriceServiceASO.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nttdata.PriceServiceASO.entity.Price;

public interface PriceRepository extends JpaRepository<Price, Integer>{
	
	public Price findById(int id);

}
