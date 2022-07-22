package Section5;

import java.util.Scanner;

public class WorkBook_05_9 {
    public static void main(String[] args) {
        String username = "Samantha";
        String password = "Java <3";
        
        /* Task 1 
            1. Pick up a username and password from the user.
       */
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome to Javagram! Sign in below\n");
        System.out.print("• Username: ");
        String username_ = scan.nextLine();
        System.out.print("• Password: ");
        String password_ = scan.nextLine();

        /* Task 2 
            1. Set up a loop that keeps running while the username OR password is incorrect. 
               When they get it wrong:
                •  println: \nIncorrect, please try again!\n
                •  get them to enter their username and password again
            2. After they enter the correct information, print: 
                   \nSign in successful. Welcome!
       */
      while (!username_ .equals(username) || !password_.equals(password)) {
        System.out.println("Try again");
        System.out.print("Username: ");
        username_ = scan.nextLine();
        System.out.print("Password: ");
        password_= scan.nextLine();

        
      }
      System.out.println("System granted access");

    }
}
