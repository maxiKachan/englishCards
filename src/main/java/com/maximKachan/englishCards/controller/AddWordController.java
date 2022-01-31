package com.maximKachan.englishCards.controller;

import com.maximKachan.englishCards.model.*;
import com.maximKachan.englishCards.repository.UserRepository;
import com.maximKachan.englishCards.service.CardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Map;

@Controller
@RequestMapping("users/{id}/addWord")
public class AddWordController {

    UserRepository userRepository;
    CardService cardService;

    public AddWordController(UserRepository userRepository, CardService cardService) {
        this.userRepository = userRepository;
        this.cardService = cardService;
    }

    @GetMapping
    public String getPage(@PathVariable int id, Model model){
        model.addAttribute("id", id);

        return "addWord";
    }

    @PostMapping
    public String postPage(@PathVariable int id, @RequestParam Map<String, String> params){
        User user = userRepository.findUserById(id);

        Type type = Type.getType(params.get("type"));
        EnglishLevel englishLevel = EnglishLevel.getEnglishLever(params.get("english_level"));

        Word word = new Word(params.get("english"),
                params.get("russian"),
                params.get("transcription"),
                type,
                englishLevel);

        Card card = new Card(user, word, LocalDate.now(), LocalDate.now(), 0, 0, false);

        cardService.addCard(card);

        return "redirect:/cards/" + id;
    }
}
