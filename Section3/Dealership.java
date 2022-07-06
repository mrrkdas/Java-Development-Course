package Section3;

import java.util.Scanner;


public class Dealership {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Java dealership");
        System.out.println(" . Select Option 'a' to buy a car");
        System.out.println(". Select Option 'b' to sell a car");

        String option = scan.nextLine();

        switch (option) {
            case "a":
                System.out.println("What is your budget?");
                int budget = scan.nextInt();

                if (budget >= 10000) {
                    System.out.println("Great a nissan Altima is available");
                    System.out.println("/n Do you have insurance?");
                    scan.nextLine();
                    String insurance = scan.nextLine();

                    System.out.println("/n Do you have a drivers license?");
                    String license = scan.nextLine();

                    System.out.println("\n What is your credit score?");
                    int creditScore = scan.nextInt();

                    if (insurance.equals("yes") && license.equals("yes") && creditScore > 660) {
                        System.out.println("Sold pleasure doing buisness with you");
                    } else {
                        System.out.println("Sorry you are not eligible");
                    }

                } else {
                    System.out.println("We don't sell cars under $10000 sorry!!");
                }
                break;
            case "b": 
            System.out.println("You are here to sell a car");
            System.out.println("What price did you purchase your car at?");
            int purchasePrice = scan.nextInt();

            System.out.println("\n What are you planning to sell your car at?");
            int sellingPrice = scan.nextInt();

            if (sellingPrice > purchasePrice) {
                System.out.println("We only accept selling prices below you purchase price");
                System.out.println("Pleasure working with you though");
            } else{
                if (sellingPrice > 30000) {
                    System.out.println("Your selling price is to high for our buisness");
                    System.out.println("Pleasure working with you though");
                } else {
                    System.out.println("Pleasure working with you we will buy your car!!");

                }
            }

            break;
            default: System.out.println("invalid option"); 
        
            scan.close();
        }
    }
}
