INSERT INTO ec_user (email, user_name, password, name, surname, birthday)
VALUES ('ivanov@gmail.com'     , 'ivan.ivan'  , 'ivan_password', 'Ivan'  , 'Ivanov'   , '13-12-1993'),
       ('petrov@gmail.com'     ,'peter.petrov','peter_password','Peter'  ,'Petrov'    , '08-06-1991'),
       ('gradushko@gmail.com'  , 'grad1993'   , 'andrij_pass'  , 'Andrei', 'gradushko', '14-12-1994'),
       ('lesiaKachan@gmail.com', 'lesia123'   , 'kachan333'    , 'Lesia' , 'Kachan'   , '31-03-1968'),
       ('OlegVilinec@gmail.com', 'oleg_villa' , 'olle_pass'    , 'Oleg'  , 'Vilinets' , '28-07-1979');

INSERT INTO ec_word(english, russian, transcription, type, level)
VALUES ('go', 'идти', '__', 'VERB', 'A1'),
       ('jump', 'прыгать', '__', 'VERB', 'A1'),
       ('see', 'смотреть', '__', 'VERB', 'A1'),
       ('sit', 'сидеть', '__', 'VERB', 'A1'),
       ('hide', 'прятаться', '__', 'VERB', 'A1');

INSERT INTO ec_card(user_id, word_id, create_date, repeat_date, attempt, streak, learned)
VALUES (1, 1, '19-12-2021', '19-12-2021', 0, 0, 'false'),
       (2, 2, '19-12-2021', '19-12-2021', 0, 0, 'false'),
       (3, 3, '19-12-2021', '19-12-2021', 0, 0, 'false'),
       (4, 4, '19-12-2021', '19-12-2021', 0, 0, 'false'),
       (5, 5, '19-12-2021', '19-12-2021', 0, 0, 'false');