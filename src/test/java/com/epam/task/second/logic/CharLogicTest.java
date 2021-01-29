package com.epam.task.second.logic;

import org.junit.Assert;
import org.junit.Test;

public class CharLogicTest {

    private final static CharLogic charLogic = new CharLogic();

    @Test
    public void testShouldReplaceEveryThirdLetterInEachWordWithBLetter() {
        String expected = "HeBlo, my naBe is PaBlo.";
        String data = "Hello, my name is Pablo.";
        int letterNumber = 3;

        String actual = charLogic.replaceEveryKthLetterInEachWordWithGivenLetter(data, letterNumber, 'B');

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testShouldReplaceEveryNthLetterInEachWordWithHLetter() {
        String expected = "With respect, with honor.";
        String data = expected;
        int letterNumber = 8;

        String actual = charLogic.replaceEveryKthLetterInEachWordWithGivenLetter(data, letterNumber, 'H');

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testShouldReplaceEveryFirstLetterInEachWordWithGLetter() {
        String expected = "G G G G G G G";
        String data = "b b b b b b b";
        int letterNumber = 1;

        String actual = charLogic.replaceEveryKthLetterInEachWordWithGivenLetter(data, letterNumber, 'G');

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testShouldReplaceEveryNinthLetterInEachWordWithQLetter() {
        String expected = "I enjoy working.";
        String data = expected;
        int letterNumber = 9;

        String actual = charLogic.replaceEveryKthLetterInEachWordWithGivenLetter(data, letterNumber, 'Q');

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFirstShouldDeleteEveryWordOfGivenSizeThatStartsWithConsonantLetter() {
        String expected = "I enjoy";
        String data = "I enjoy working.";
        int wordSize = 7;

        String actual = charLogic.deleteEveryWordOfGivenSizeThatStartsWithConsonantLetter(data, wordSize);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSecondShouldDeleteEveryWordOfGivenSizeThatStartsWithConsonantLetter() {
        String expected = "apples.";
        String data = "Purple apples.";
        int wordSize = 6;

        String actual = charLogic.deleteEveryWordOfGivenSizeThatStartsWithConsonantLetter(data, wordSize);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testThirdShouldDeleteEveryWordOfGivenSizeThatStartsWithConsonantLetter() {
        String expected = "Old";
        String data = "Old telephone.";
        int wordSize = 9;

        String actual = charLogic.deleteEveryWordOfGivenSizeThatStartsWithConsonantLetter(data, wordSize);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFourthShouldDeleteEveryWordOfGivenSizeThatStartsWithConsonantLetter() {
        String expected = "Near the old where I lived.";
        String data = "Near the old warehouse, where I lived.";
        int wordSize = 9;

        String actual = charLogic.deleteEveryWordOfGivenSizeThatStartsWithConsonantLetter(data, wordSize);

        Assert.assertEquals(expected, actual);
    }
}
