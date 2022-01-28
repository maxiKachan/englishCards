package com.maximKachan.englishCards.controller;

import com.maximKachan.englishCards.model.User;
import com.maximKachan.englishCards.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {

    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public String getWelcomePage(@PathVariable int id, Model model){
        User user = userService.findUserById(id);
        model.addAttribute("username", user.getUsername());

        return "user";
    }
}
