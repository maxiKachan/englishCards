package com.maximKachan.englishCards.service;


import com.maximKachan.englishCards.model.User;
import com.maximKachan.englishCards.repository.UserRepositoryImpl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

import static com.maximKachan.englishCards.util.TestHelperServiceLayer.TEST_USER;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

public class UserServiceImplTest {

    private static final UserRepositoryImpl userRepository = Mockito.mock(UserRepositoryImpl.class);
    private static final UserServiceImpl userService = new UserServiceImpl(userRepository);
    private static final ArgumentCaptor<User> captor = ArgumentCaptor.forClass(User.class);

    @BeforeAll
    static void prepareUserRepositoryMock(){
        when(userRepository.findUserById(1)).thenReturn(TEST_USER);
        when(userRepository.findUserByEmail("test")).thenReturn(TEST_USER);
        doNothing().when(userRepository).addUser(captor.capture());
    }

    @Test
    void findUserByEmail(){
        User user = userService.findUserByEmail("test");
        assertEquals(TEST_USER, user);
    }

    @Test
    void findUserById(){
        User user = userService.findUserById(1);
        assertEquals(TEST_USER, user);
    }

    @Test
    void addUser(){
        userService.addUser(TEST_USER);
        assertEquals(TEST_USER, captor.getValue());
    }
}
