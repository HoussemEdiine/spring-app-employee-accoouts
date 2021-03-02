package com.testinspring.testspring.bootstrap;

import com.testinspring.testspring.domain.Account;
import com.testinspring.testspring.domain.Author;
import com.testinspring.testspring.domain.Employee;
import com.testinspring.testspring.repository.AccountRepository;
import com.testinspring.testspring.repository.AuthorRepository;
import com.testinspring.testspring.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class BootStrap implements CommandLineRunner {
    private  final AuthorRepository authorRepository ;
    private  final EmployeeRepository employeeRepository;
    private  final AccountRepository accountRepository ;

    public BootStrap(AuthorRepository authorRepository, EmployeeRepository employeeRepository, AccountRepository accountRepository) {
        this.authorRepository = authorRepository;
        this.employeeRepository = employeeRepository;
        this.accountRepository = accountRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        Author odda = new Author("odda","echiro");
        Author tochiro = new Author("tochio" , "omoa");
        Author hugo  = new Author("hugo" , "victor");
        Employee employee = new Employee("houseem","massoudi");
        Employee employee1 = new Employee("mouhamed","massoudi");
        Account account1 = new Account("houssemeddine21");
        Account account2 = new Account("adem2");
        Account account3 = new Account("mouhamed3");
        Account account4 =new Account("1564sa644az5");
        Account account5 = new Account("2364dqs6412");

        account4.setEmployee(employee1);
        account5.setEmployee(employee1);
        account1.setEmployee(employee);
        account2.setEmployee(employee);
        account3.setEmployee(employee);

        Set<Account> employeeaccounts  = new HashSet<>();
        employeeaccounts.add(account1);
        employeeaccounts.add(account2);
        employeeaccounts.add(account3);
        // employee 2
       Set<Account>  employee2accounts = new HashSet<>();
           employee2accounts.add(account4);
           employee2accounts.add(account5);

        employee.setAccount(employeeaccounts);
        employee1.setAccount(employee2accounts);
        employeeRepository.save(employee);
        employeeRepository.save(employee1);
        authorRepository.save(odda);
        authorRepository.save(tochiro);
        authorRepository.save(hugo);
        System.out.println("cout " + employeeRepository.count());


    }
}
