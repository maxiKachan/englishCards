package com.maximKachan.englishCards.repository;

import com.maximKachan.englishCards.model.Word;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaWord extends JpaRepository<Word, Integer> {

    @Override
    <S extends Word> S save(S entity);
}
