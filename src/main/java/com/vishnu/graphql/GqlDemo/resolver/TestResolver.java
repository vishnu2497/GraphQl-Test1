package com.vishnu.graphql.GqlDemo.resolver;

import com.vishnu.graphql.GqlDemo.Book;
import com.vishnu.graphql.GqlDemo.BookRepoistory;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class TestResolver implements GraphQLQueryResolver {

    @Autowired
    BookRepoistory bookRepoistory;

    public Book bookById(String id){
        return bookRepoistory.findById(id).get();
    }
    public int getHelloRandom( ){
        return new Random().nextInt();
    }

    public String getHelloMessage( ){
        return "welcome to kirikalan magic shiw ";
    }
}
