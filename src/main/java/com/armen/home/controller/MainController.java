package com.armen.home.controller;

import com.armen.home.domain.Message;
import com.armen.home.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * This is a main class for controllers
 */
@Controller
public class MainController {

    @GetMapping("/")
    public String getMain(Model model){
        model.addAttribute("title", "Главная страница");
        return "welcome";
    }

    @GetMapping("/get")
    public String getRequest(Model model){
        model.addAttribute("title", "Главная страница");
        return "home";
    }

    @GetMapping("/user")
    public User getUsers(Model model) {
        return new User("Иван", "Иванов");
    }

    @GetMapping("/message")
    public Message getMessage() {
        return new Message("Привет всем!", "01.01.2020 12:00:00");
    }



}