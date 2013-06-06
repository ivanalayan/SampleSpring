package com.oandb.mysql;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oandb.models.Product;

public class SpringMain {

	public static void main(String[] args) throws SQLException, IOException {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		ProductDAOImpl productDAO = context.getBean("ProductDAO",
				ProductDAOImpl.class);
		Product product = new Product();
		product.setName("MyPRoduct");
		product.setPrice(new BigDecimal("120.00"));
		product.setQty(100);
		productDAO.addProduct(product);
		
		List<Product> products = productDAO.getAllProducts();
		for(Product prod : products){
			System.out.println(prod);
		}		
	}

}
