package com.epam.task.second.logic;

import org.apache.log4j.Logger;

public class CharLogic implements Logic {

    private static final Logger LOGGER = Logger.getLogger(StringLogic.class);
    private static final String WHITESPACE_CHARACTER = "\s";

    public String replaceEveryKthLetterInEachWordWithGivenLetter(String data, int letterNumber, char givenLetter) {
        LOGGER.info("Method replaceEveryKthLetterInWordsWithGivenLetter using Char Array started.");
        StringBuilder stringBuilder = new StringBuilder();
        String[] words = data.split(WHITESPACE_CHARACTER);
        int i=0;
        while (i<words.length) {
            char[] currentWord = words[i].toCharArray();
            int j=0;
            while (j<currentWord.length) {
                if (j==letterNumber-1 && currentWord[j] != ',' && currentWord[j] != '.') {
                    currentWord[j] = givenLetter;
                }
                j++;
            }
            String processedWord = new String(currentWord);
            stringBuilder.append(processedWord).append(" ");
            i++;
        }
        String processedData = stringBuilder.toString();
        LOGGER.info("Method replaceEveryKthLetterInWordsWithGivenLetter using Char Array finished.");
        return processedData.trim();
    }

    public String deleteEveryWordOfGivenSizeThatStartsWithConsonantLetter(String data, int wordSize) {
        LOGGER.info("Method deleteEveryWordThatStartsWithGivenLetter using Char Array started.");
        StringBuilder stringBuilder = new StringBuilder();
        String[] words = data.split(WHITESPACE_CHARACTER);
        int i=0;
        while (i<words.length) {
            char[] currentWord = words[i].toCharArray();
            int currentWordSize = currentWord.length;
            char firstLetter = currentWord[0];
            char lastLetter = currentWord[currentWord.length-1];
            if (lastLetter == ',' || lastLetter == '.') {
                currentWordSize -= 1;
            }
            if (currentWordSize == wordSize && !(isVowel(firstLetter))) {

            } else {
                String processedWord = new String(currentWord);
                stringBuilder.append(processedWord).append(" ");
            }
            i++;
        }
        String processedData = stringBuilder.toString();
        LOGGER.info("Method deleteEveryWordThatStartsWithGivenLetter using Char Array finished.");
        return processedData.trim();
    }
}
