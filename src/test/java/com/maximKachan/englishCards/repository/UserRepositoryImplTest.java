package com.maximKachan.englishCards.repository;

import com.maximKachan.englishCards.model.User;
import com.maximKachan.englishCards.util.TestHelper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlConfig;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ContextConfiguration({"classpath:spring/spring-context.xml", "classpath:spring/spring-db.xml"})
@ExtendWith(SpringExtension.class)
@Sql(scripts = {"classpath:database/create-tables.sql", "classpath:database/populate-database.sql"},
        config = @SqlConfig(encoding = "UTF-8"))
class UserRepositoryImplTest {

    private static final Logger log = LoggerFactory.getLogger(UserRepositoryImplTest.class);

    @Autowired
    private UserRepository userRepository;

    @Test
    void findUserByEmail() {
        log.info("<**********     Start Test     **********>");
        User user = userRepository.findUserByEmail("ivanov@gmail.com");
        assertEquals(TestHelper.TEST_USER, user);
        log.info("<**********     Finished Test     **********>");
    }

    @Test
    void addUser() {
    }
}