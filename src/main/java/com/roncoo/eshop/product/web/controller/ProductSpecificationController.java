package com.roncoo.eshop.product.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.roncoo.eshop.product.model.ProductProperty;
import com.roncoo.eshop.product.model.ProductSpecification;
import com.roncoo.eshop.product.service.ProductSpecificationService;

@RestController
@RequestMapping("/product-specification")
public class ProductSpecificationController {

	@Autowired
	private ProductSpecificationService productSpecitionService;
	
	@RequestMapping("/add")
	@ResponseBody
	public String add(ProductSpecification productSpecition,String operationType){
		try {
			productSpecitionService.add(productSpecition,operationType);
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
		return "success";
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public String update(ProductSpecification productSpecition,String operationType){
		try {
			productSpecitionService.update(productSpecition,operationType);
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
		return "success";
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public String delete(Long id,String operationType){
		try {
			productSpecitionService.delete(id,operationType);
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
		return "success";
	}
	
	@RequestMapping("/findById")
	@ResponseBody
	public ProductSpecification findById(Long id){
		try {
		  return productSpecitionService.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ProductSpecification();
	}
	
	@RequestMapping("/findByProductId")
	@ResponseBody
	public ProductSpecification findByProductId(Long productId){
		try {
		  return productSpecitionService.findByProductId(productId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ProductSpecification();
	}
}
