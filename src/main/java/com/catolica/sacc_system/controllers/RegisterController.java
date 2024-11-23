package com.catolica.sacc_system.controllers;

import com.catolica.sacc_system.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@Controller
public class RegisterController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    /*@PostMapping("/register")
    public String registerStudent() {

        //return "login";
    }*/

    @ModelAttribute("courses")
    public List<String> courses() {
        return List.of("Ciência da Computação", "Análise e Desenvolvimento de Sistemas", "Direito", "Educação Física", "Filosofia", "Outro");
    }
}
