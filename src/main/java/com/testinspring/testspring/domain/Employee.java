package com.testinspring.testspring.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Employee {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id ;
    private  String name ;
    private  String lastname ;
    @OneToMany(cascade = CascadeType.ALL ,fetch = FetchType.LAZY)
    private Set<Account> account = new HashSet<>();

    public Employee  (){ }

    public Employee(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;

    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Set<Account> getAccount() {
        return account;
    }

    public void setAccount(Set<Account> account) {
        this.account = account;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
