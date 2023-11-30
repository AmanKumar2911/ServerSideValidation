package com.first.springvalidation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.first.springvalidation.Entites.LoginData;

import jakarta.validation.Valid;

@Controller
public class MyController {
    
    @GetMapping("/")
    public String openForm(Model m){
        System.out.println("Opening From");
        m.addAttribute("loginData", new LoginData());
        return "form";
    }

    //handler for processing form

    @PostMapping("/process")
    public String processFrom(@Valid @ModelAttribute("loginData") LoginData loginData ,BindingResult result){
        if(result.hasErrors()){
            System.out.println(result);
            return "form";
        }
        System.out.println(loginData);
        return "index";
    }
}
