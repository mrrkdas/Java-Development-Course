package Section4;

import java.util.Scanner;

public class challenge_04 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Do you want to play rock paper scissors?");

        String decision = scan.nextLine();

        if (decision.equals("yes")) {
            System.out.println("Let's play Rock Paper Scissors.");
            System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.");
            System.out.println("Are you ready?");
            System.out.println("Rock");
            System.out.println("Paper");
            System.out.println("Scissor");
            System.out.println("Shoot!!");

            String decision_ = scan.nextLine();


        } else {
            System.out.println("Bye!! ");
        }
              
        scan.close();
    }



    public static String computerChoice() {
        int number = (int) Math.random() * 2;

        if (number == 1) {
            String rock = "rock";
            return rock;
        } else if (number == 2) {
            String paper = "paper";
            return paper;
        } else {
            String scissors = "scissors";
            return scissors;
        }
    }





    public static String result(String yourChoice, String computerChoice) {
        String result = "";
        
        if (yourChoice.equals("rock") && computerChoice.equals("scissors")) {
            result = "You win!";
        } else if (yourChoice.equals("rock") && computerChoice.equals("paper")) {
            result = "You lose!";
        } else if (yourChoice.equals("paper") && computerChoice.equals("rock")) {
            result = "You win!";
        } else if (yourChoice.equals("paper") && computerChoice.equals("scissors")) {
            result = "You lose!";
        } else if (yourChoice.equals("scissors") && computerChoice.equals("paper")) {
            result = "You win!";
        }   else if (yourChoice.equals("scissors") && computerChoice.equals("rock")) {
            result = "You lose!";
        }  else if (yourChoice.equals(computerChoice)) {
            result = "It's a tie!";
        }  
        return result;
      }

 
     //Task 5  – Write a function that prints your choice, the computer's, and the result.

    /**
     * Name: printResult - It prints everything (your choice, computer choice, result)
     * @param yourChoice (String)
     * @param computerChoice (String)
     * @param result (String)
     * 
     * Inside the function:
     * 
     *  1. prints everything:
     *      – prints: You chose:          <your choice>
     *      – prints: The computer chose: <computer choice>
     *      – prints: <result>
     */
    public static void printResult(String yourChoice, String computerChoice, String result) {
        System.out.println("Your choice" + yourChoice);
        System.out.println("Computer choice" + computerChoice);
        System.out.println(result);
    }

}
    



