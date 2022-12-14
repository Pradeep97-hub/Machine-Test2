package com.javatechie.crud.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatechie.crud.example.entity.Product;
import com.javatechie.crud.example.repository.ProductRepository;

@Service
public class ProductService 
{

	@Autowired
	private ProductRepository repository;
	
	public Product saveProduct(Product product)
	{
		return repository.save(product);
	}
	public List<Product> saveProducts(List<Product> products)
	{
		return repository.saveAll(products);
	}
	public List<Product> getProducts()
	{
		return repository.findAll();
	}
	
	public Optional<Product> getProductById(int id)
	{
		return repository.findById(id);
	}
	
	public Product getProductByName(String name)
	{
		return repository.findByName(name);
	}
	
	public String deleteProduct(int id)
	{
		repository.deleteById(id);
		return "product removed  "+id;
	}
	public Product updateProduct(Product product)
	{
		Optional<Product> existingProduct=repository.findById(product.getId());
		existingProduct.setName(product.getName());
		existingProduct.setQuantity(product.getQuantity());
		existingProduct.setPrice(product.getPrice());
		return repository.save(existingProduct);
	}
	
}
