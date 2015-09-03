package com.example;

public class MyClass
{
  // David Durbin
  // Variables Program
    public static void main(String[] args)
    {

        short notLong = 42;
        int notShortOrLong = 42000;
        long tallWomanInABlackDress = 4200000;
        float sink = 42.42f;
        double triple = 3.14159;
        char chair = 'E';
        Boolean guess = true;
        byte nibble = 4;

        System.out.println("This episode of \"Programming with Bill\" is brought to you by: \n");
        System.out.println("The number " + notLong + " and the number " + triple +".\n");
        System.out.println("Also the letter " + chair + " and the word " + guess + ".\n");
        System.out.println("Our sponsors are " + nibble + " and " + sink + ".\n");
        System.out.println("Additional funding was provided by " + tallWomanInABlackDress + ".\n");
        System.out.println("Funding for this station and other PBS stations is provided by " +
        " viewers like you!");
    }
}
