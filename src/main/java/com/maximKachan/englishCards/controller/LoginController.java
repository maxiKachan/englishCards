package com.maximKachan.englishCards.controller;

import com.maximKachan.englishCards.model.User;
import com.maximKachan.englishCards.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/login")
public class LoginController {

    private static final Logger log = LoggerFactory.getLogger(LoginController.class);

    private final UserService userService;

    public LoginController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public String getLoginPage(){
        return "login";
    }

    @PostMapping()
    public String authorizeUser(@RequestParam("username") String username,
                                @RequestParam("password") String password,
                                Model model){
        User user = userService.findUserByEmail(username);
        if (user.getPassword().equals(password)) {
            model.addAttribute("username", user.getUsername());
            model.addAttribute("id", user.getId());
            log.info("authorizeUser");
            return "redirect:/users/"+ user.getId();
        }
        System.out.println(user);
        return "login";
    }
}
