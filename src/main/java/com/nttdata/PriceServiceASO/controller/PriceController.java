package com.nttdata.PriceServiceASO.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.PriceServiceASO.entity.Price;
import com.nttdata.PriceServiceASO.service.PriceServiceI;

@RestController
@RequestMapping("/prices")
public class PriceController {
	
	@Autowired
	private PriceServiceI priceService;
	
	@GetMapping("/get-price/{id}")
	public BigDecimal getPrice(final @PathVariable Integer id) {
		return priceService.getPrice(id);
	}
	
	@GetMapping("/get-all-prices")
	public List<BigDecimal> getAllPrices(){
		return priceService.getAllPrices();
		
	}
}
