package SectionTwo;

import java.util.Scanner;

public class WorkBook_02_5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to JavaGram! Let's sign you up.");
        

        //Task 1 - Using Scanner, ask the user questions

        //Ask for their first name.
        System.out.println("What is your first name?");
        String first_name = scan.nextLine();
        //Ask for their last name.
        System.out.println("What is your last name?");
        String last_name = scan.nextLine();
        //Ask: how old are you?
        System.out.println("How old are you?");
        int age = scan.nextInt();
        //Ask them to make a username.
        System.out.println("Make your username: ");
        String username = scan.nextLine();
        //Ask what city they live in.
        System.out.println("What city do you live in?");
        String city = scan.nextLine();
        //Ask what country that's from.
        System.out.println("What country are you from? ");
        String country = scan.nextLine();
        System.out.println("Thank you for joining JavaGram!");

        //Print their information like so:

        // Your information:
        //        First Name: Rayan
        //        Last Name: Slim
        //        Age: 27
        //        Username: monotonic_relu
        //        City: Ottawa
        //        Country: Canada
        //
        System.out.println("Your Information: ");
        System.out.println("    First Name: " + first_name);
        System.out.println("    Last Name: " + last_name);
        System.out.println("    Age: " + age);
        System.out.println("    Username: " + username);
        System.out.println("    City: " + city);
        System.out.println("    country: " + country);


        //close scanner. It's good practice :D ! 
        scan.close();
    }
}