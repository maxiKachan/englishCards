package com.maximKachan.englishCards.repository;

import com.maximKachan.englishCards.model.Card;
import org.springframework.stereotype.Repository;

@Repository
public class CardRepositoryImpl implements CardRepository{

    private final JpaCard jpaCard;

    public CardRepositoryImpl(JpaCard jpaCard) {
        this.jpaCard = jpaCard;
    }

    @Override
    public void addCard(Card card) {
        jpaCard.save(card);
    }
}
