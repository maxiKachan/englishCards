package com.maximKachan.englishCards.util;

import com.maximKachan.englishCards.model.User;

import java.time.LocalDate;

public class TestHelperServiceLayer {
    public static final User TEST_USER = new User(1, "email", "user_name", "password",
            "name","surname", LocalDate.of(1994, 10, 10));
}
