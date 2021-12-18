package com.maximKachan.englishCards.util;

import com.maximKachan.englishCards.model.User;

import java.time.LocalDate;

public class TestHelper {
    public static final User TEST_USER_BY_EMAIL = new User(1,"ivanov@gmail.com", "ivan.ivan",
            "ivan_password", "Ivan", "Ivanov", LocalDate.of(1993, 12, 13));
    public static final User TEST_USER_SAVE = new User("sidorov@gmail.com", "sidor",
            "sidor_pass", "Sidor", "Sidoroov", LocalDate.of(1978, 9, 6));
    public static final User TEST_USER_SAVED = new User(6,"sidorov@gmail.com", "sidor",
            "sidor_pass", "Sidor", "Sidoroov", LocalDate.of(1978, 9, 6));
}
