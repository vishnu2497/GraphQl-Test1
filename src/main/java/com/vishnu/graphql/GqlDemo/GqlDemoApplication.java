package com.vishnu.graphql.GqlDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class GqlDemoApplication {

	@Autowired
	BookRepoistory bookRepoi;

	public static void main(String[] args) {
		SpringApplication.run(GqlDemoApplication.class, args);
	}


	@PostConstruct
	public void tt(){
		List<Book> books = Arrays.asList(
				new Book("1", "TestBook1", "Vis", "One"),
				new Book("2", "TestBook2", "ram", "Two"),
				new Book("3", "TestBook3", "hnu", "Three")

		);

		bookRepoi.saveAll(books);
	}

}
