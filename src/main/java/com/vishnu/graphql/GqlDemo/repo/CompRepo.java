package com.vishnu.graphql.GqlDemo.repo;

import com.vishnu.graphql.GqlDemo.model.Company;
import com.vishnu.graphql.GqlDemo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompRepo extends JpaRepository<Company,String> {
}
