package firstshop.com.service;

import java.util.List;

import firstshop.com.entity.Product;

public interface ProductService {
	void add(Product product);
	List<Product> findAll();
}
