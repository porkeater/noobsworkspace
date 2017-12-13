package firstshop.com.daoimpl;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;

import firstshop.com.dao.CartDao;
import firstshop.com.entity.Product;

public class CartDaoImpl implements CartDao{
	@Resource
	private SessionFactory sessionFactory;

	@Override
	public Product findById(int id) {
		String hql = "from Product where id = ?";
		Product product =  (Product) sessionFactory.openSession().createQuery(hql).setParameter(0, id).uniqueResult();
		return product;
	}

	@Override
	public void updateCart(Product product) {
		this.sessionFactory.getCurrentSession().saveOrUpdate(product);
		
	}
	
	
}
