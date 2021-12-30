package com.maximKachan.englishCards.repository;

import com.maximKachan.englishCards.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

public interface JpaCard extends JpaRepository<Card, Integer> {

    @Override
    @Transactional
    <S extends Card> S save(S entity);
}
