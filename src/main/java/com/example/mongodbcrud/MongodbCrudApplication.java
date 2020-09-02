package com.example.mongodbcrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// The component scan is done by default in our Spring Boot app. When we execute our app, Spring will scan
// the current package we're in (and all subpackages) to search for classes and dependencies which it can
// wire together for us.
@ComponentScan("com.example.mongodbcrud")
public class MongodbCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongodbCrudApplication.class, args);
	}

}
