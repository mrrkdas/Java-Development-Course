package SectionTwo;

import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int counter = 0;
        // nextLine() waigts for user to input a string
        System.out.println("Welcome. Thank you for taking the survey");
        System.out.println("What is your name?");
        String name = scan.nextLine();
        counter ++;

        System.out.println("How much money do you spend on coffee");
        double coffeePrice = scan.nextDouble();
        counter ++;

        System.out.println("How much do you spend on fast food?");
        double foodPrice = scan.nextDouble();
        counter ++;

        System.out.println("How many times a week to you buy coffee");
        int coffeeAmount = scan.nextInt();
        counter ++;

        System.out.println("How many times a week do you buy fast food");
        int foodAmount = scan.nextInt();
        counter ++;
        
        System.out.println("\nThank You" + name + "for answering" + counter + "questions");

        // We always have to do this because scan is like a connection, we have to close it.
        scan.close();


    }
    
}
