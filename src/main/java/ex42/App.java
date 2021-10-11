/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Brandon Terry
 */
package ex42;

import java.io.IOException;

public class App
{
    public static void main(String[] args) throws IOException
    {
        // Create instance of Format class
        Format myCSV = new Format();

        // Get number of rows from .txt
        myCSV.setNumRows(myCSV.rowCount("src/main/java/ex42/exercise42_input.txt"));
        String[] list = myCSV.readToArray();

        int i;

        // Format the table
        System.out.print("Last      First     Salary\n" +
                "--------------------------\n");

        String space = " ";

        // Remove commas from array
        for (i=0; i<myCSV.getNumRows(); i++)
        {
            int j=0;
            list[i] = list[i].replace(",", " ");

            while(list[i].charAt(j) != ' ')
                j++;

            StringBuffer resString = new StringBuffer(list[i]);
            int k;
            for(k=j+1; k<10; k++)
                resString.insert(j , space);

            list[i] = resString.toString();
        }

        // Align data by checking if digit
        for (i=0; i<myCSV.getNumRows(); i++)
        {
            int j=0;
            int count=10;
            while(!(Character.isDigit(list[i].charAt(count))))
            {
                j++;
                count++;
            }

            //  Align salary column
            StringBuffer resString = new StringBuffer(list[i]);
            int k;
            for(k=j; k<10; k++)
                resString.insert(j-1+10 , space);

            list[i] = resString.toString();
            System.out.println(list[i]);
        }
    }
}
