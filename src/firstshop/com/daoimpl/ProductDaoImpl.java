package firstshop.com.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import firstshop.com.dao.ProductDao;
import firstshop.com.entity.Product;


@Component
@Repository
@Transactional
public class ProductDaoImpl implements ProductDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Product> findAll() {
		List<Product> list = sessionFactory.openSession().createQuery("from Product").list();
		return list;
	}

	@Override
	public List<Product> findByPage() {
		return null;
	}

	@Override
	public void add(Product product) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(product);
		tx.commit();
		session.close();
		
	}

}
