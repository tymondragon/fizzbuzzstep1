package com.fizzbuzz;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private final App app = new App();
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void shouldReturnFizz() {
        assertEquals("Returns fizz", app.fizzOrBuzz(3), "fizz");
    }

    @Test
    public void shouldReturnBuzz() {
        assertEquals("Returns buzz", app.fizzOrBuzz(5), "buzz");
    }

    @Test
    public void shouldReturnFizzbuzz() {
        assertEquals("Returns fizzbuzz", app.fizzOrBuzz(15), "fizzbuzz");
    }

    @Test
    public void shouldReturnNumber() {
        assertEquals("Returns integer inserted when it is not divisible by 3 or 5", app.fizzOrBuzz(4), "4");
    }
}
