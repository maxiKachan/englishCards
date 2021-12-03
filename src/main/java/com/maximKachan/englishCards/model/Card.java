package com.maximKachan.englishCards.model;

import java.util.Objects;

public class Card {
    private Integer cardId;
    private Integer cardNumber;
    private User user;
    private Word word;

    public Card() {
    }

    public Card(Integer cardId, Integer cardNumber, User user, Word word) {
        this.cardId = cardId;
        this.cardNumber = cardNumber;
        this.user = user;
        this.word = word;
    }

    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public Integer getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Integer cardNumber) {
        this.cardNumber = cardNumber;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return cardId.equals(card.cardId) && cardNumber.equals(card.cardNumber) && user.equals(card.user) && word.equals(card.word);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardId, cardNumber, user, word);
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardId=" + cardId +
                ", cardNumber=" + cardNumber +
                ", user=" + user +
                ", word=" + word +
                '}';
    }
}
