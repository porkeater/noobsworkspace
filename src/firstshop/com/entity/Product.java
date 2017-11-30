package firstshop.com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	@Id
	@Column(name = "productname")
	private String productname;
	@Column(name = "price")
	private int price;
	public String getName() {
		return productname;
	}
	public void setName(String name) {
		this.productname = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
