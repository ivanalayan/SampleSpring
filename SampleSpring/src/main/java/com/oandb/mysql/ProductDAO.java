package com.oandb.mysql;

import java.sql.SQLException;
import java.util.List;

import com.oandb.models.Product;

public interface ProductDAO {

	public void addProduct(Product product) throws SQLException;
	public List<Product> getAllProducts();
}
