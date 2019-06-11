package com.me;

import org.junit.Before;

import static org.junit.Assert.*;

public class UtilitiesTest {


    private String firstPair = "AABCDDEFF";
    private String secondPair = "ABCCABDEEF";
    private String thirdPair = "A";
    private String fourthPair = "!@#$%^&*()";
    private String fifthPair = "!@#$%^&*(())";

    Utilities utils;

    @Before
    // before will always start with a fresh instance for every method
    public void setup(){
        utils = new Utilities();
    }

    @org.junit.Test
    public void everyNthChar() {
        char[] output = utils.everyNthChar(new char[] {'h','e','l','l','o'},2);
        assertArrayEquals(new char[] {'e','l'}, output);
    }

    @org.junit.Test
    public void everyNthChar_TestOverMaxLength() {
        char[] output = utils.everyNthChar(new char[] {'h','e','l','l','o'},6);
        assertArrayEquals(new char[] {'h','e','l','l','o'}, output);
    }

    @org.junit.Test
    public void removePairs_firstPair() {
        String firstPairTest = utils.removePairs(firstPair);
        assertEquals("ABCDEF",firstPairTest);
    }

    @org.junit.Test
    public void removePairs_secondPair() {
        String secondPairTest = utils.removePairs(secondPair);
        assertEquals("ABCABDEF",secondPairTest);
    }

    @org.junit.Test
    public void removePairs_ThirdPair() {
        String thirdPairTest = utils.removePairs(thirdPair);
        assertEquals("A",thirdPairTest);
    }

    @org.junit.Test
    public void removePairs_FourthPair() {
        String fourthPairTest = utils.removePairs(fourthPair);
        assertEquals(fourthPair,fourthPairTest);
    }

    @org.junit.Test
    public void removePairs_FifthPair() {
        String fifthPairTest = utils.removePairs(fifthPair);
        assertEquals("!@#$%^&*()",fifthPairTest);
    }

    @org.junit.Test
    public void removePairs_TestNull() {
        String testNull = utils.removePairs(null);
        assertNull(testNull);
    }

    @org.junit.Test
    public void removePairs_TestEmptyString() {
        String testEmptyString = utils.removePairs("");
        assertEquals("",testEmptyString);
    }


    @org.junit.Test
    public void converter() {
        assertEquals(300,utils.converter(10,5));
    }

    @org.junit.Test (expected = ArithmeticException.class)
    public void converter_ArithmeticException() throws Exception {
        // test for throw exception
        // expected value does not matter
        utils.converter(10,0);
    }

    @org.junit.Test
    public void nullIfOddLength_testOddChar() {
        assertNull(utils.nullIfOddLength("ABC"));
    }

    @org.junit.Test
    public void nullIfOddLength_testEvenChar() {
        assertEquals("ABCD", utils.nullIfOddLength("ABCD"));
    }

}