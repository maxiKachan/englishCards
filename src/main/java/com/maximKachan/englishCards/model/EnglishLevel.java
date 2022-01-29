package com.maximKachan.englishCards.model;

public enum EnglishLevel {
    A1("Elementary"),
    A2("Pre-Intermediate"),
    B1("Intermediate"),
    B2("Upper-Intermediate"),
    C1("Advanced"),
    C2("Proficiency"),
    UNDEFINED("-");

    private final String description;

    EnglishLevel(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }

    public static EnglishLevel getEnglishLever(String level){
        switch (level){
            case "A1": return EnglishLevel.A1;
            case "A2": return EnglishLevel.A2;
            case "B1": return EnglishLevel.B1;
            case "B2": return EnglishLevel.B2;
            case "C1": return EnglishLevel.C1;
            case "C2": return EnglishLevel.C2;
            case "UNDEFINED": return EnglishLevel.UNDEFINED;
            default: throw new RuntimeException("Wrong english level");
        }
    }
}
