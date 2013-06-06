package com.oandb.searchengine;

import java.io.IOException;
import java.util.Properties;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
	public static void main(String[] args) throws IOException {

	
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		SearchEngine searchEngine = context.getBean("searchEngine",
				SearchEngine.class);
		System.out.println(searchEngine.search("Spring") ? "Word found!!"
				: "Word not found!!");
		context.close();
		
		Properties prop = new Properties();
		prop.load(SpringMain.class
				.getResourceAsStream("/configuration.properties"));
		 
		System.out.println(prop.get("method"));
	}
}
