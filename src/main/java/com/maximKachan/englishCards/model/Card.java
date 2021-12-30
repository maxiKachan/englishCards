package com.maximKachan.englishCards.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "ec_card")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "card_id")
    private Integer cardId;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "word_id")
    private Word word;
    @Column(name = "create_date")
    private LocalDate createDate;
    @Column(name = "repeat_date")
    private LocalDate repeatDate;
    @Column(name = "attempt")
    private Integer attempt;
    @Column(name = "streak")
    private Integer streak;
    @Column(name = "learned")
    private Boolean isLearned;

    public Card() {
    }

    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Word getWord() {
        return word;
    }

    public void setWord(Word word) {
        this.word = word;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public LocalDate getRepeatDate() {
        return repeatDate;
    }

    public void setRepeatDate(LocalDate repeatDate) {
        this.repeatDate = repeatDate;
    }

    public Integer getAttempt() {
        return attempt;
    }

    public void setAttempt(Integer attempt) {
        this.attempt = attempt;
    }

    public Integer getStreak() {
        return streak;
    }

    public void setStreak(Integer streak) {
        this.streak = streak;
    }

    public Boolean getLearned() {
        return isLearned;
    }

    public void setLearned(Boolean learned) {
        isLearned = learned;
    }
}
