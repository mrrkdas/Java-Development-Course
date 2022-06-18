package Section3;

import java.util.Scanner;

public class WorkBook_03_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n****ROYAL BANK OF JAVA****");
        System.out.println("Are you here to get a mortgage? (yes or no)");

        String decision = scan.next();

        if (decision.equals("yes")) {
            System.out.println("\nGreat! In one line" +
                 "\nHow much money do you have in your savings?" +
                 "\nAnd, how much do you owe in credit card debt?");

            int savings = scan.nextInt();
            int debt = scan.nextInt();

            System.out.println("\nHow many years have you worked for?");

            int workYears = scan.nextInt();

            System.out.println("What is your name?");

            String name = scan.next();

            if (savings >= 10000 && debt < 5000 && workYears > 2) {
                System.out.println("Congratulations" + name + ", you have been approved!");
            } else {
                System.out.println("Sorry, you are not eligible for a mortgage");
            }
            






        } else {
            System.out.println("Ok, have a nice day");
        }


        scan.close();
    }


    
}
