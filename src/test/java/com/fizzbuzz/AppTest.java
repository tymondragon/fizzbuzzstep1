package com.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private final FizzBuzz fizzBuzz = new FizzBuzz();
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void shouldReturnFizz() {
        assertEquals("Returns fizz", fizzBuzz.fizzOrBuzz(3), "fizz");
    }

    @Test
    public void shouldReturnBuzz() {
        assertEquals("Returns buzz", fizzBuzz.fizzOrBuzz(5), "buzz");
    }

    @Test
    public void shouldReturnFizzbuzz() {
        assertEquals("Returns fizzbuzz", fizzBuzz.fizzOrBuzz(15), "fizzbuzz");
    }

    @Test
    public void shouldReturnNumber() {
        assertEquals("Returns integer inserted when it is not divisible by 3 or 5", fizzBuzz.fizzOrBuzz(4), "4");
    }

    //stringBuilder
    @Test
    public void shouldReturnAStringOfFizzbuzz() {
        assertEquals("Returns a concatenated string result", fizzBuzz.buildString(5), "1 2 fizz 4 buzz");
    }

    @Test
    public void trimsWhiteSpace() {
        assertNotEquals("String with tailing whitespace", fizzBuzz.buildString(5), "1 2 fizz 4 buzz ");
    }
}
