package com.douzone.aoptest.service;

import org.springframework.stereotype.Service;

import com.douzone.aoptest.vo.ProductVo;

@Service
public class ProductService {

	public ProductVo find(String name) {
		System.out.println("[ProductService] finding... ");
	
		/*if(1-1 == 0) {
			throw new RuntimeException("Find Exception");
		}*/
		ProductVo vo = new ProductVo(name);
		return new ProductVo(name);
	}

}
