package com.vishnu.graphql.GqlDemo;

import com.vishnu.graphql.GqlDemo.model.Company;
import com.vishnu.graphql.GqlDemo.model.Employee;
import com.vishnu.graphql.GqlDemo.repo.CompRepo;
import com.vishnu.graphql.GqlDemo.repo.EmpRepo;
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

    @Autowired
    EmpRepo empRepo;

    @Autowired
    CompRepo compRepo;

    public static void main(String[] args) {
        SpringApplication.run(GqlDemoApplication.class, args);
    }


    @PostConstruct
    public void tt() {
        List<Book> books = Arrays.asList(
                new Book("1", "TestBook1", "Vis", "One"),
                new Book("2", "TestBook2", "ram", "Two"),
                new Book("3", "TestBook3", "hnu", "Three")

        );

        bookRepoi.saveAll(books);

        List<Employee> employees = Arrays.asList(new Employee("E232", "Steffy", "mayor", 5, "C232"),
                new Employee("E233", "Mike", "Taylor", 4, "C233"));

        empRepo.saveAll(employees);

        List<Company> companies = Arrays.asList(new Company("C232", "TECH EX", "Product Compny"),
                new Company("C233", "Infy", "Tech Company"));

        compRepo.saveAll(companies);

    }

}
