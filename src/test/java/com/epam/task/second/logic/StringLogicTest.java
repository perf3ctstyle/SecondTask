package com.epam.task.second.logic;

import org.junit.Assert;
import org.junit.Test;

public class StringLogicTest {

    private final static StringLogic stringLogic = new StringLogic();

    @Test
    public void testShouldReplaceEveryThirdLetterInEachWordWithBLetterWhenStringApplied() {
        String expected = "HeBlo, my naBe is PaBlo.";
        String data = "Hello, my name is Pablo.";
        int letterNumber = 3;

        String actual = stringLogic.replaceEveryKthLetterInEachWordWithGivenLetter(data, letterNumber, 'B');

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testShouldReplaceEveryNthLetterInEachWordWithHLetterWhenStringApplied() {
        String expected = "With respect, with honor.";
        String data = expected;
        int letterNumber = 8;

        String actual = stringLogic.replaceEveryKthLetterInEachWordWithGivenLetter(data, letterNumber, 'H');

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testShouldReplaceEveryFirstLetterInEachWordWithGLetterWhenStringApplied() {
        String expected = "G G G G G G G";
        String data = "b b b b b b b";
        int letterNumber = 1;

        String actual = stringLogic.replaceEveryKthLetterInEachWordWithGivenLetter(data, letterNumber, 'G');

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testShouldReplaceEveryNinthLetterInEachWordWithQLetterWhenStringApplied() {
        String expected = "I enjoy working.";
        String data = expected;
        int letterNumber = 9;

        String actual = stringLogic.replaceEveryKthLetterInEachWordWithGivenLetter(data, letterNumber, 'Q');

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFirstShouldDeleteEveryWordOfGivenSizeThatStartsWithConsonantLetterWhenStringApplied() {
        String expected = "I enjoy";
        String data = "I enjoy working.";
        int wordSize = 7;

        String actual = stringLogic.deleteEveryWordOfGivenSizeThatStartsWithConsonantLetter(data, wordSize);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSecondShouldDeleteEveryWordOfGivenSizeThatStartsWithConsonantLetterWhenStringApplied() {
        String expected = "apples.";
        String data = "Purple apples.";
        int wordSize = 6;

        String actual = stringLogic.deleteEveryWordOfGivenSizeThatStartsWithConsonantLetter(data, wordSize);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testThirdShouldDeleteEveryWordOfGivenSizeThatStartsWithConsonantLetterWhenStringApplied() {
        String expected = "Old";
        String data = "Old telephone.";
        int wordSize = 9;

        String actual = stringLogic.deleteEveryWordOfGivenSizeThatStartsWithConsonantLetter(data, wordSize);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFourthShouldDeleteEveryWordOfGivenSizeThatStartsWithConsonantLetterWhenStringApplied() {
        String expected = "Near the old where I lived.";
        String data = "Near the old warehouse, where I lived.";
        int wordSize = 9;

        String actual = stringLogic.deleteEveryWordOfGivenSizeThatStartsWithConsonantLetter(data, wordSize);

        Assert.assertEquals(expected, actual);
    }
}
