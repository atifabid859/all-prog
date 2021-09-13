package productcrudapp.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import productcrudapp.model.Product;

@Component
public class ProductDao {
	@Autowired
private HibernateTemplate hibernateTemplate;
	//create
	
	@Transactional
public void createProduct(Product product) {
	this.hibernateTemplate.saveOrUpdate(product);
}
	//get All product
	public List<Product> getProducts(){
		List<Product> product = this.hibernateTemplate.loadAll(Product.class);
		return product;
	}
	//delete the single product
	@Transactional
	public void deleteProduct(int pId) {
		Product load = this.hibernateTemplate.load(Product.class,pId);
		this.hibernateTemplate.delete(load);
	}
	//get single product id
	public Product getProduct(int pId) {
		return this.hibernateTemplate.get(Product.class ,pId);
	}
}
