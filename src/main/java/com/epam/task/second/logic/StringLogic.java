package com.epam.task.second.logic;

import org.apache.log4j.Logger;

public class StringLogic implements Logic {

    private static final Logger LOGGER = Logger.getLogger(StringLogic.class);
    private static final String WHITESPACE_CHARACTER = "\s";

    public String replaceEveryKthLetterInEachWordWithGivenLetter(String data, int letterNumber, char givenLetter) {
        LOGGER.info("Method replaceEveryKthLetterInWordsWithGivenLetter using String started.");
        StringBuilder currentWord = new StringBuilder();
        StringBuilder processedWords = new StringBuilder();
        for (String part : data.split(WHITESPACE_CHARACTER)) {
            currentWord.append(part);
            if (part.length() >= letterNumber) {
                if (part.charAt(letterNumber-1) != ',' && part.charAt(letterNumber-1) != '.') {
                    currentWord.replace(letterNumber - 1, letterNumber, Character.toString(givenLetter));
                }
                processedWords.append(currentWord).append(" ");
            } else {
                processedWords.append(currentWord).append(" ");
            }
            currentWord.delete(0, part.length());
        }
        String processedText = processedWords.toString();
        LOGGER.info("Method replaceEveryKthLetterInWordsWithGivenLetter using String finished.");
        return processedText.trim();
    }

    public String deleteEveryWordOfGivenSizeThatStartsWithConsonantLetter(String data, int wordSize) {
        LOGGER.info("Method deleteEveryWordThatStartsWithGivenLetter using String started.");
        StringBuilder stringBuilder = new StringBuilder();
        for (String part : data.split(WHITESPACE_CHARACTER)) {
            char firstLetter = part.charAt(0);
            int currentWordSize = part.length();
            char lastLetter = part.charAt(currentWordSize-1);
            if (lastLetter == ',' || lastLetter == '.') {
                currentWordSize -= 1;
            }
            if (currentWordSize == wordSize && !(isVowel(firstLetter))) {

            } else {
                stringBuilder.append(part).append(" ");
            }
        }
        String processedData = stringBuilder.toString();
        LOGGER.info("Method deleteEveryWordThatStartsWithGivenLetter using String finished.");
        return processedData.trim();
    }
}