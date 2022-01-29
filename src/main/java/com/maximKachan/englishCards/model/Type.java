package com.maximKachan.englishCards.model;

public enum Type {
    ADJECTIVE,
    ADVERB,
    AUXILIARY_VERB,
    DETERMINER,
    EXCLAMATION,
    MODAL_VERB,
    NOUN,
    PHRASAL_VERB,
    PHRASE,
    PREPOSITION,
    PRONOUN,
    VERB;

    public static Type getType(String type){
        switch (type){
            case "ADJECTIVE": return Type.ADJECTIVE;
            case "ADVERB": return Type.ADVERB;
            case "AUXILIARY_VERB": return Type.AUXILIARY_VERB;
            case "DETERMINER": return Type.DETERMINER;
            case "EXCLAMATION": return Type.EXCLAMATION;
            case "MODAL_VERB": return Type.MODAL_VERB;
            case "NOUN": return Type.NOUN;
            case "PHRASAL_VERB": return Type.PHRASAL_VERB;
            case "PHRASE": return Type.PHRASE;
            case "PREPOSITION": return Type.PREPOSITION;
            case "PRONOUN": return Type.PRONOUN;
            case "VERB": return Type.VERB;
            default: throw new RuntimeException("Wrong parameter type");
        }
    }
}
