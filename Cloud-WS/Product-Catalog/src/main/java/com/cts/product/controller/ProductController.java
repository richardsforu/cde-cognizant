package com.cts.product.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.product.dao.ProductDao;
import com.cts.product.entity.Product;

@RestController
@RequestMapping("/api")
@CrossOrigin
@RefreshScope
public class ProductController {
	
	private double discount;
	
	@Autowired
	private ProductDao productDao;
	
	@GetMapping("/products")
	public List<Product> listAll(){		
		return  productDao.findAll();
	}

}
