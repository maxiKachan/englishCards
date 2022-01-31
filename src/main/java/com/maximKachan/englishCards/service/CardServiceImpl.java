package com.maximKachan.englishCards.service;

import com.maximKachan.englishCards.model.Card;
import com.maximKachan.englishCards.repository.JpaCard;
import com.maximKachan.englishCards.repository.JpaWord;
import org.springframework.stereotype.Service;

@Service
public class CardServiceImpl implements CardService{

    JpaWord jpaWord;
    JpaCard jpaCard;

    public CardServiceImpl(JpaWord jpaWord, JpaCard jpaCard) {
        this.jpaWord = jpaWord;
        this.jpaCard = jpaCard;
    }

    @Override
    public void addCard(Card card) {
        jpaWord.save(card.getWord());
        jpaCard.save(card);
    }
}
