package com.maximKachan.englishCards.repository;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlConfig;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static com.maximKachan.englishCards.util.TestHelper.TEST_CARD_SAVE;

@ContextConfiguration({"classpath:spring/spring-context.xml", "classpath:spring/spring-db.xml"})
@ExtendWith(SpringExtension.class)
@Sql(scripts = {"classpath:database/create-tables.sql", "classpath:database/populate-database.sql"},
        config = @SqlConfig(encoding = "UTF-8"))
public class CardRepositoryImplTest {

    private static final Logger log = LoggerFactory.getLogger(CardRepositoryImplTest.class);

    @Autowired
    private CardRepository cardRepository;

    @Test
    void addCard(){
        log.info("<**********     Start Test     **********>");
        cardRepository.addCard(TEST_CARD_SAVE);
        log.info("<**********     Finished Test     **********>");
    }
}
