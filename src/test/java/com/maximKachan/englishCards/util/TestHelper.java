package com.maximKachan.englishCards.util;

import com.maximKachan.englishCards.model.User;

import java.time.LocalDate;

public class TestHelper {
    public static final User TEST_USER = new User(1,"ivanov@gmail.com", "ivan.ivan",
            "ivan_password", "Ivan", "Ivanov", LocalDate.of(1993, 12, 13));
}
