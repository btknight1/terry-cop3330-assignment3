/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Brandon Terry
 */
package ex44;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App
{
    public static void main(String[] args) throws FileNotFoundException
    {

        //Create double list to store the values
        List<Double> values = new ArrayList<Double>();
        Scanner input = new Scanner(System.in);
        // Create instance of data class
        Data myData = new Data();
        // Get product string
        System.out.print("What is the product name? ");
        myData.setSearchThis(input.nextLine());

        // Read json file to string array
        int i =0;
        File readFile = new File("./src/main/java/ex44/exercise44_input.json");
        Scanner in = new Scanner(readFile);
        while (in.hasNextLine())
        {
            myData.setProducts(in.nextLine());
        }
        in.close();

        // Send back newly formatted String array
        String list[] = myData.getProducts();


        int result = myData.find();
        if(result != 0)
        {
            if(result != 0)
            {
                // Extract the numerical values from the string
                // Access each index of string array
                Matcher m = Pattern.compile("(?!=\\d\\.\\d\\.)([\\d.]+)").matcher(list[result]);
                while (m.find())
                {
                    double d = Double.parseDouble(m.group(1));
                    values.add(d);
                }
                System.out.println("Name: " + myData.getSearchThis());
                System.out.println("Price: " + values.get(0));
                System.out.print("Quantity: " + (int) Math.round(values.get(1)));
            }
        }
        else
            System.out.println("Sorry, that product was not found in our inventory.");


        // Loop until valid product is found
        while(result == 0)
        {
            System.out.print("What is the product name? ");
            myData.setSearchThis(input.nextLine());
            result = myData.find();

            // Extract the numerical values from the string
            // Access each index of string array
            if(result != 0)
            {
                Matcher m = Pattern.compile("(?!=\\d\\.\\d\\.)([\\d.]+)").matcher(list[result]);
                while (m.find())
                {

                    double d = Double.parseDouble(m.group(1));
                    values.add(d);
                }
                System.out.println("Name: " + myData.getSearchThis());
                System.out.println("Price: " + values.get(0));
                System.out.print("Quantity: " + (int) Math.round(values.get(1)));

            }
            else
                System.out.println("Sorry, that product was not found in our inventory.");
        }
    }
}
