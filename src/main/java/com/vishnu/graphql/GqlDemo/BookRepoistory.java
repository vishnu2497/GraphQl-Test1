package com.vishnu.graphql.GqlDemo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepoistory extends JpaRepository<Book,String> {
}
