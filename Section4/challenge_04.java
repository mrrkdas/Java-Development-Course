package Section4;

import java.util.Scanner;

public class challenge_04 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Do you want to play rock paper scissors?");

        String decision = scan.nextLine();

        if (decision.equals("yes")) {
            System.out.println("Let's play Rock Paper Scissors.");
            System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
            System.out.println("Are you ready?");
            System.out.println("Rock");
            System.out.println("Paper");
            System.out.println("Scissor");
            System.out.println("Shoot!!")

            String decision_ = scan.nextLine();


        } else {
            System.out.println("Bye!! ");
        }
              
        scan.close();
    }


    //Task 3  – Write a function where the computer picks a random choice.

    /**
     * Function name: computerChoice - picks randomly between rock paper and scissors
     * @return a choice (String).
     * 
     * Inside the function:
     *   1. Picks a random number between 0 and 2.
     *   2. if 0: returns the choice 'rock'
     *      if 1: returns the choice 'paper'
     *      if 2: returns the choice 'scissors'
     */

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




    //Task 4  – Write a function that compares the choices and returns the result.

    /**
     * Function name: result - It returns the result of the game.
     *  @param yourChoice (String)
     *  @param computerChoice (String) 
     *  @return result (String) 

     * Inside the function:
     *   1. result is "You win" if:
     * 
     *       You: "rock"      Computer: "scissors"
     *       You: "paper"     Computer: "rock"
     *       You: "scissors"  Computer: "paper"
     * 
     *   2. result is "You lose" if:
     * 
     *       Computer: "rock"      You: "scissors"
     *       Computer: "paper"     You: "rock"
     *       Computer: "scissors"  You: "paper"
     * 
     *   3. result is "It's a tie" if:
     * 
     *       your choice equals computer choice.
     *   
     */

    public static String result(String yourChoice, String computerChoice) {
        String result = "";

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

}
