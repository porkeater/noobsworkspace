package firstshop.com.serviceimpl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import firstshop.com.daoimpl.ProductDaoImpl;
import firstshop.com.entity.Product;
import firstshop.com.service.ProductService;

@Component
@Service
@Transactional
public class ProductServiceImpl implements ProductService{

	@Resource
	private ProductDaoImpl productDaoImpl;
	
	@Override
	public void add(Product product) {
		this.productDaoImpl.add(product);
		
	}

}
