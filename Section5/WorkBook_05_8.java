package Section5;

import java.util.Scanner;

public class WorkBook_05_8 {
    public static void main(String[] args) {
        /* Task 1 
            1. Store a "secret" number between 1 and 5. 
            2. Then, prompt the user to enter a guess.
       */
      double random = (int) (Math.random() * 5) + 1;
      

    
       System.out.print("I chose a number between 1 and 5. Try to guess it: ");
        
       Scanner scan = new Scanner(System.in);


        int guess = scan.nextInt(); 

        while (guess != random) {
            System.out.print("You messed up, try again: ");
            guess = scan.nextInt();
        }

        System.out.println("You got it right");
        scan.close();
    }
}