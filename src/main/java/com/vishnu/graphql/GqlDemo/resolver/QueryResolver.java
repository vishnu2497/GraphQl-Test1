package com.vishnu.graphql.GqlDemo.resolver;

import com.vishnu.graphql.GqlDemo.model.Company;
import com.vishnu.graphql.GqlDemo.model.Employee;
import com.vishnu.graphql.GqlDemo.repo.CompRepo;
import com.vishnu.graphql.GqlDemo.repo.EmpRepo;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class QueryResolver implements GraphQLQueryResolver {

    @Autowired
    EmpRepo empRepo;

    @Autowired
    CompRepo compRepo;

    public List<Employee> employees() {
        return empRepo.findAll();
    }

    public List<Company> companies() {
        return compRepo.findAll();
    }

    public Employee empById(String id){
        return empRepo.findById(id).get();
    }

    public Company cmpById(String id){
        return compRepo.findById(id).get();
    }
}
