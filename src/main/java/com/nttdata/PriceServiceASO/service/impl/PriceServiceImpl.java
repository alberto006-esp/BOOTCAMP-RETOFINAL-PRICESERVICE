package com.nttdata.PriceServiceASO.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.PriceServiceASO.entity.Price;
import com.nttdata.PriceServiceASO.repository.PriceRepository;
import com.nttdata.PriceServiceASO.service.PriceServiceI;

@Service
public class PriceServiceImpl implements PriceServiceI {
	
	@Autowired
	private PriceRepository priceRepository;

	@Override
	public BigDecimal getPrice(Integer id) {
		return priceRepository.findById(id).get().getPrice();
	}

	@Override
	public List<BigDecimal> getAllPrices() {
		List<Price> listaPrecios = priceRepository.findAll();
		List<BigDecimal> listaPreciosBigDecimals = new ArrayList<BigDecimal>();
		for (Price price : listaPrecios) {
			BigDecimal precio = price.getPrice();
			listaPreciosBigDecimals.add(precio);
		}
		return listaPreciosBigDecimals;
	}

}
