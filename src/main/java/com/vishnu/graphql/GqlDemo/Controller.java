package com.vishnu.graphql.GqlDemo;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class Controller {
//    @GetMapping("/books")
//    public Book findTheBookById(@RequestParam("bookId") String id){
//        return Book.getBook(id);
//    }
//    @GetMapping("/")
//    String abc(){
//        return "hello";
//    }

    @QueryMapping
    public Book bookById(@Argument String id ){
        return Book.getBook(id);
    }
    @SchemaMapping(typeName = "Query",field = "helloMessage")
    public String efgh( ){
        return "Hello GraphQL Exercise 1";
    }

    @SchemaMapping(typeName = "Query",field = "helloRandom")
    public int abcd( ){
        return new Random().nextInt();
    }
}
