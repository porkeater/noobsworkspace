package firstshop.com.dao;

import firstshop.com.entity.Product;

public interface CartDao {
	Product findById(int id);
	void updateCart(Product product);
}
