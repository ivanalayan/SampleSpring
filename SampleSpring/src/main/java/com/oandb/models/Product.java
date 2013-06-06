package com.oandb.models;

import java.math.BigDecimal;

public class Product {
	
	private long id;
	private String name;
	private int qty;
	private BigDecimal price;
	
	public Product(long id, String name, int qty, BigDecimal price) {
		this.id = id;
		this.name = name;
		this.qty = qty;
		this.setPrice(price);
	}

	public Product() {
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", qty=" + qty
				+ ", price=" + price + "]";
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

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public BigDecimal getPrice() {
		return new BigDecimal(price.toString());
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}


	
}
