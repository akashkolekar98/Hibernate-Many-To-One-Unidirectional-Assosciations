package com.jsp.product.review.service;

import java.util.List;

import com.jsp.product.review.dao.ProductDao;
import com.jsp.product.review.dto.Product;

public class ProductService {

	ProductDao productDao = new ProductDao();

	public Product createProduct(Product product) {
		return productDao.createProduct(product);
	}

	public Product getProductById(int id) {
		return productDao.getProductById(id);
	}

	public Product deleteProductById(int id) {
		return productDao.deleteProductById(id);
	}

	public Product updateProductById(int id, String brand, String name, String type, int price) {

		return productDao.updateProductById(id, brand, name, type, price);
	}

	public List<Product> getAllProduct() {
		return productDao.getAllProduct();
	}

}
