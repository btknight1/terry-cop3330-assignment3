/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Brandon Terry
 */
package ex43;

import java.io.IOException;
import java.util.Scanner;

public class App
{
    public static void main(String[] args) throws IOException
    {
        // Create instance of site class and scanner class
        Site mySite = new Site();
        Scanner input = new Scanner(System.in);

        // Gather input
        System.out.print("Site name: ");
        mySite.setSite_name(input.nextLine());
        System.out.print("Author: ");
        mySite.setAuthor(input.nextLine());
        System.out.print("Do you want a folder for JavaScript? ");
        mySite.setJs_folder(input.nextLine());
        System.out.print("Do you want a folder for CSS? ");
        mySite.setCss_folder(input.nextLine());

        mySite.set_directories(mySite.getSite_name(), mySite.getAuthor(), mySite.getJs_folder(), mySite.getCss_folder());
    }
}