package com.vishnu.graphql.GqlDemo;

import java.util.Arrays;
import java.util.List;

public class Book {
    private String id;

    private String name;

    private String author;

    private String testName;

    public Book(String id, String name, String author, String testName) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.testName = testName;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public Book() {
    }
    private static List<Book> books =Arrays.asList(
            new Book("1","TestBook1","Vis","One"),
            new Book("2","TestBook2","ram","Two"),
            new Book("3","TestBook3","hnu","Three")

    );

    public static Book getBook(String id ){
        return books.stream().filter(x->x.id.equalsIgnoreCase(id)).findFirst().get();
    }

//    public Book(String id, String name, String author) {
//        this.id = id;
//        this.name = name;
//        this.author = author;
//    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
