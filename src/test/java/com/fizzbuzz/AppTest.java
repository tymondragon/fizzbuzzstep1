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
}
