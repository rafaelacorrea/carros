package com.example.carros.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class IndexExamples {
    //@GetMapping
    //public String get(){
    //    return "Get Spring Boot";
    //}

    //@PostMapping
    //public String post(){
    //    return "Post Spring Boot";
    //}

    @PutMapping
    public String put(){
        return "Put Spring Boot";
    }

    @DeleteMapping
    public String delete(){
        return "Delete Spring Boot";
    }

    //@GetMapping("/login")
    //public String login(@RequestParam("login") String login, @RequestParam("senha") String senha){
    //    return "Login: " + login + ", Senha: " + senha;
    //}

    //@GetMapping("/login/{login}/senha/{senha}")
    //public String login(@PathVariable("login") String login, @PathVariable("senha") String senha){
    //    return "Login: " + login + ", Senha: " + senha;
    //}

    @PostMapping("/login")
    public String login(@RequestParam("login") String login, @RequestParam("senha") String senha){
        return "Login: " + login + ", Senha: " + senha;
    }



}
