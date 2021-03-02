package com.testinspring.testspring.service;

import com.testinspring.testspring.domain.Author;
import com.testinspring.testspring.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AuthorService {
 final  private AuthorRepository authorRepository ;


    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }
    public ArrayList<Author> getallauthor (){
      return (ArrayList<Author>) authorRepository.findAll();

    }
}
