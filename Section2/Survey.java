package Section2;

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

        System.out.println("\nHow much money do you spend on coffee");
        double coffeePrice = scan.nextDouble();
        counter ++;

        System.out.println("\nHow much do you spend on fast food?");
        double foodPrice = scan.nextDouble();
        counter ++;

        System.out.println("\nHow many times a week to you buy coffee");
        int coffeeAmount = scan.nextInt();
        counter ++;

        System.out.println("\nHow many times a week do you buy fast food");
        int foodAmount = scan.nextInt();
        counter ++;
        
        System.out.println("\nThank You" + name + "for answering" + counter + "questions");
        System.out.println("Your fast food expenses are" + (foodAmount * foodPrice) + ".");
        System.out.println("Your fast food expenses are" + (foodPrice/coffeePrice) + "more than your coffee expenses");
        // We always have to do this because scan is like a connection, we have to close it.
        scan.close();


    }
    
}
