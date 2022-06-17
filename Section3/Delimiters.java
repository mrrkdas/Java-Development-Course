package Section3;

import java.util.Scanner;

public class Delimiters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = scan.nextInt();

        scan.nextLine();
        
        System.out.println("Please write a sentence");
        String text = scan.nextLine();

        scan.close();


    }
    
}

