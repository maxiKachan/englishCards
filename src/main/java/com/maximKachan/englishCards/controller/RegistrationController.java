package com.maximKachan.englishCards.controller;

import com.maximKachan.englishCards.model.User;
import com.maximKachan.englishCards.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.Map;

@Controller
@RequestMapping("registration")
public class RegistrationController {

    UserService userService;

    public RegistrationController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String getRegisterPage(){
        return "registration";
    }

    @PostMapping
    public String registerUser(@RequestParam Map<String, String> params){
        String email = params.get("email");
        String username = params.get("username");
        String password = params.get("password");
        String name = params.get("name");
        String surname = params.get("surname");
        String birthday = params.get("birthday");

        if (username == null || password == null) throw new RuntimeException("input username and password");

        LocalDate birthdayDate = LocalDate.parse(birthday);

        User user = new User(email, username, password, name, surname, birthdayDate);
        userService.addUser(user);
        User savedUser = userService.findUserByEmail(email);
        int id = savedUser.getId();

        return "redirect:users/" + id;
    }
}
