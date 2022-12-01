package com.vishnu.graphql.GqlDemo.resolver;

import com.vishnu.graphql.GqlDemo.Book;
import graphql.kickstart.tools.GraphQLResolver;
import org.springframework.stereotype.Component;

@Component
public class BookResolver implements GraphQLResolver<Book> {

    public String getFirstName(Book book){
        return book.getName().concat(book.getId());
    }

}
