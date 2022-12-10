package com.vishnu.graphql.GqlDemo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
    private String id;

    private String firstName;

    private String lastName;

    private int jobLevel;

    private String companyId;

    public Employee() {
    }

    public Employee(String id, String firstName, String lastName, int jobLevel, String companyId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobLevel = jobLevel;
        this.companyId = companyId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getJobLevel() {
        return jobLevel;
    }

    public void setJobLevel(int jobLevel) {
        this.jobLevel = jobLevel;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }
}
