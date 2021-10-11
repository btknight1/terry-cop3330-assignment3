/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Brandon Terry
 */
package ex46;

import ex45.Modify;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class App
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Track myText = new Track();
        File readFile = new File("src/main/java/ex46/exercise46_input.txt");
        Scanner input = new Scanner(readFile);
        while (input.hasNextLine())
        {
            myText.addString(input.nextLine());
            if(input.hasNextLine())
                myText.addString("\n");
        }
        input.close();

        Integer array[] = new Integer[3];
        String str_array[] = {"badger", "mushroom", "snake"};

        // number of badgers -0
        array[0] = myText.count(myText.getText(), "badger");

        //number of mushrooms -1
        array[1] = myText.count(myText.getText(), "mushroom");

        // number of snakes -2
        array[2] = myText.count(myText.getText(), "snake");

        int max = Collections.max(Arrays.asList(array));
        int min = Collections.min(Arrays.asList(array));


        int i;
        for(i=0; i<3; i++)
        {
            if(array[i] == max)
            {
                System.out.print(str_array[i] + ": ");
                for(int j=0; j<max; j++)
                {
                    System.out.print("*");
                }
                System.out.println("");
                break;
            }
        }

        int mid =0;
        for (i=0; i<3; i++)
        {
            if(array[i] != max && array[i] != min)
            {
                mid=i;
                System.out.print(str_array[mid] + ": ");
                for(int j=0; j<array[mid]; j++)
                {
                    System.out.print("*");
                }
                System.out.println("");
                break;
            }
        }

        for(i=0; i<3; i++)
        {
            if(array[i] == min)
            {
                System.out.print(str_array[i] + ": ");
                for(int j=0; j<min; j++)
                {
                    System.out.print("*");
                }
                break;
            }
        }
    }
}
