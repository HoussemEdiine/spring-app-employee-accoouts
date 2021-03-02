package com.testinspring.testspring.controler;

import com.testinspring.testspring.domain.Author;
import com.testinspring.testspring.service.AuthorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/api/author")
public class AuthorController {
    final private AuthorService authorService ;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }


    @GetMapping("/authors-details")
    public ArrayList<Author> getallauthor (){
        return   authorService.getallauthor() ;
    }

}
