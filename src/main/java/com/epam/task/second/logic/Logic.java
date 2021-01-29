package com.epam.task.second.logic;

public interface Logic {

    default boolean isVowel(char c) {
        return switch (Character.toLowerCase(c)) {
            case 'a', 'e', 'i', 'o', 'u', 'y' -> true;
            default -> false;
        };
    }

    String replaceEveryKthLetterInEachWordWithGivenLetter(String data, int letterNumber, char givenLetter);

    String deleteEveryWordOfGivenSizeThatStartsWithConsonantLetter(String data, int wordSize);
}
