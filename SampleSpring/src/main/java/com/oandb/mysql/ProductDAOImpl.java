package com.oandb.mysql;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.oandb.models.Product;

public class ProductDAOImpl implements ProductDAO {

	private MySqlConnectionFactory connection;

	@Override
	public void addProduct(Product product) {

		try {
			String sql = "INSERT INTO product(`name`,`price`,`qty`) VALUES (?,?,?);";
			PreparedStatement statement = connection.getConnection()
					.prepareStatement(sql);
			statement.setString(1, product.getName());
			statement.setBigDecimal(2, product.getPrice());
			statement.setInt(3, product.getQty());
			statement.execute();
		} catch (SQLException error) {
			error.printStackTrace();
		}
	}

	@Override
	public List<Product> getAllProducts() {
		List<Product> products = new ArrayList<Product>();
		String sql = "SELECT `id`,`name`,`price`,`qty` FROM product";
		try {
			PreparedStatement statement = connection.getConnection()
					.prepareStatement(sql);
			ResultSet result = statement.executeQuery();
			
			while(result.next()){
					long id = result.getLong("id");
					String name = result.getString("name");
					int qty = result.getInt("qty");
					BigDecimal price = result.getBigDecimal("price");
					products.add(new Product(id, name, qty, price));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return products;
	}

	public MySqlConnectionFactory getConnection() {
		return connection;
	}

	public void setConnection(MySqlConnectionFactory connection) {
		this.connection = connection;
	}

}
