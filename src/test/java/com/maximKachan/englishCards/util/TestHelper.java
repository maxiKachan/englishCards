package com.maximKachan.englishCards.util;

import com.maximKachan.englishCards.model.*;

import java.time.LocalDate;

public class TestHelper {
    public static final User TEST_USER_BY_EMAIL = new User(1,"ivanov@gmail.com", "ivan.ivan",
            "ivan_password", "Ivan", "Ivanov", LocalDate.of(1993, 12, 13));


    public static final User TEST_USER_SAVE = new User("sidorov@gmail.com", "sidor",
            "sidor_pass", "Sidor", "Sidoroov", LocalDate.of(1978, 9, 6));
    public static final User TEST_USER_SAVED = new User(6,"sidorov@gmail.com", "sidor",
            "sidor_pass", "Sidor", "Sidoroov", LocalDate.of(1978, 9, 6));


    public static final Word TEST_WORD_SAVE =
            new Word("move", "двигаться", "__", Type.VERB, EnglishLevel.A2);
    public static final Word TEST_WORD_SAVED =
            new Word(5,"hide", "прятаться", "__", Type.VERB, EnglishLevel.A1);

    public static final Card TEST_CARD_SAVE = new Card(TEST_USER_BY_EMAIL, TEST_WORD_SAVED, LocalDate.now(),
            LocalDate.now(), 0, 0, false);
}
