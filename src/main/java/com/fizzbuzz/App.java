package com.fizzbuzz;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public String fizzOrBuzz(int indexedNumber) {
        String value = "";
        if (indexedNumber % 3 == 0) {
            value = "fizz";
        }
        else if (indexedNumber % 5 ==0) {
            value = "buzz";
        }
        return value;
    }
}
