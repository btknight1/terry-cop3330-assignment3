/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Brandon Terry
 */
package ex45;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class App
{
    public static void main(String[] args) throws IOException
    {
        // Create instance of Modify class
        Modify myText = new Modify();
        // Create a file reader
        File readFile = new File("src/main/java/ex45/exercise45_input.txt");
        Scanner input = new Scanner(readFile);

        // read in the data
        while (input.hasNextLine())
        {
            myText.addString(input.nextLine());
            if(input.hasNextLine())
                myText.addString("\n");
        }
        input.close();

        // remove cases of utilize with use
        input = new Scanner(System.in);
        myText.replace("\\butilize\\b", "use");
        myText.replace("\\butilizes\\b", "use");

        String filename = "";
        System.out.print("Output file name: ");
        filename = input.nextLine();
        myText.createFile(filename);
    }
}
