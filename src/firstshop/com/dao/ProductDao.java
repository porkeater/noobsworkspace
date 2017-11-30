package firstshop.com.dao;

import java.util.List;

import firstshop.com.entity.Product;

public interface ProductDao {
	List<Product> findAll();
	List<Product> findByPage();
	void add(Product product);
}
