package com.maximKachan.englishCards.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.maximKachan.englishCards.model.Card;
import com.maximKachan.englishCards.model.Word;

import java.time.ZoneId;
import java.util.Date;

public class CardDto {
    private Word word;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm")
    private Date createDate;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm")
    private Date repeatDate;
    private Integer attempt;
    private Integer streak;
    private Boolean isLearned;

    public CardDto (Card card){
        word = card.getWord();
        createDate = Date.from(card.getCreateDate().atStartOfDay(ZoneId.systemDefault()).toInstant());
        repeatDate = Date.from(card.getRepeatDate().atStartOfDay(ZoneId.systemDefault()).toInstant());
        attempt = card.getAttempt();
        streak = card.getStreak();
        isLearned = card.getLearned();
    }

    public Word getWord() {
        return word;
    }

    public void setWord(Word word) {
        this.word = word;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getRepeatDate() {
        return repeatDate;
    }

    public void setRepeatDate(Date repeatDate) {
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

    @Override
    public String toString() {
        return "CardDto{" +
                "word=" + word +
                ", createDate=" + createDate +
                ", repeatDate=" + repeatDate +
                ", attempt=" + attempt +
                ", streak=" + streak +
                ", isLearned=" + isLearned +
                '}';
    }
}
