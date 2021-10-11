/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Brandon Terry
 */
package ex41;

import java.io.IOException;
import java.util.Arrays;

public class App
{
    public static void main(String[] args) throws IOException
    {
        // Create an instance of the sort class.
        Sort myNames = new Sort();

        // Read the number of lines in the text file
        myNames.setNumNames(myNames.nameCount("src/main/java/ex41/exercise41_input.txt"));

        // Perform sort and print to text file
        myNames.sortAndOutput();
    }
}