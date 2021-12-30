package com.maximKachan.englishCards.repository;

import com.maximKachan.englishCards.model.Word;
import org.springframework.stereotype.Repository;

@Repository
public class WordRepositoryImpl implements WordRepository{


    private final JpaWord jpaWord;

    public WordRepositoryImpl(JpaWord jpaWord) {
        this.jpaWord = jpaWord;
    }

    @Override
    public void addWord(Word word) {
        jpaWord.save(word);
    }
}
