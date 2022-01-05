package com.maximKachan.englishCards.controller;

import com.maximKachan.englishCards.dto.CardDto;
import com.maximKachan.englishCards.model.Card;
import com.maximKachan.englishCards.model.User;
import com.maximKachan.englishCards.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashSet;
import java.util.Set;

@Controller
@RequestMapping("cards")
public class CardController {

    private static final Logger log = LoggerFactory.getLogger(CardController.class);

    private final UserService userService;

    public CardController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/{id}")
    public String getUser(@PathVariable int id, Model model) {
        User user = userService.findUserById(id);
        Set<Card> cards = user.getCards();
        Set<CardDto> cardsDto = new HashSet<>();
        for (Card card : cards) {
            cardsDto.add(new CardDto(card));
        }
        model.addAttribute("cards", cardsDto);
        log.info("get User");
        System.out.println(user);
        return "cards";

    }
}
