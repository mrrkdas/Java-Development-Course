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
                int budget = scan.nextInt()

                if (budget >= 10000) {
                    System.out.println("Great a nissan Altima is available");

                } else {
                    System.out.println("We don't sell cars under $10000 sorry!!");
                }
                break;
            case "b": System.out.println("you chose option " + option); break;
            default: System.out.println("invalid option"); 
        }
    }
}
