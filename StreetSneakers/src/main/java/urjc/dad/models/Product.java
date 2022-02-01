package urjc.dad.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String name;
	private String description;
	private double price;
	private double size;
	//private Set<Review> reviews;
	
	public Product() {
		
	}
	
	public Product(String name, String description, float price, float size) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.size = size;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public double getSize() {
		return size;
	}

	public void setSize(float size) {
		this.size = size;
	}
	
	


}
