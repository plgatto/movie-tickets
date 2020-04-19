package com.plgatto.movieticket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class App implements CommandLineRunner {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS ticket("
				+ "id INTEGER PRIMARY KEY AUTOINCREMENT, "
				+ "movie TEXT NOT NULL, "
				+ "screen TEXT NOT NULL, "
				+ "seat TEXT NOT NULL);");
	}
}