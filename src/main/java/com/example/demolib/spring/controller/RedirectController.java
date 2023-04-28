package com.example.demolib.spring.controller;


import com.example.demolib.domain.Author;
import com.example.demolib.spring.repository.AuthorRepository;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@Log
@RequestMapping
public class RedirectController {


    @Autowired
    private AuthorRepository authorRepository;




    @GetMapping
    public String baseUrlRedirect(HttpServletRequest request, HttpServletResponse httpServletResponse) {

        List<Author> authorList = authorRepository.findAll();

        return "ok";
    }
}
