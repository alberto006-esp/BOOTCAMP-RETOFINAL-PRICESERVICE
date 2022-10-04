package com.nttdata.PriceServiceASO.service;

import java.math.BigDecimal;
import java.util.List;

import com.nttdata.PriceServiceASO.entity.Price;

public interface PriceServiceI {
	
	public BigDecimal getPrice(Integer id);
	
	public List<BigDecimal> getAllPrices();

}
