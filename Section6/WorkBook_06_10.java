package Section6;

import java.util.Arrays;
import java.util.Scanner;

public class WorkBook_06_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /**  Task 1: 
         *   1. Ask the user: How many pizza toppings do you want?. 
         *   2. Then, pick up the result using Scanner.
         */

         System.out.println("How many pizza toppings do you want?");
         int toppingsNum = scan.nextInt();

        // Task 2 – Create the array here
        String[] toppings = new String[toppingsNum + 1];

        /** Task 3
         *  print Great, enter each topping!
         *  Create a for loop that runs through the length of the array.   
         * 
         */

         System.out.println("Great, enter each topping!");

         for (int i = 0; i < toppings.length; i++) {
            /** Task 4 – Pick up the user's toppings and store them in the array.
         *  
         *  See the workbook article for more detail  
         * 
         */
            toppings[i] = scan.nextLine();
         }



        /** Task 5 –  Loop through the length of the array and print each topping
         *  
         *  See the workbook article for more detail   
         * 
         */

        System.out.println(Arrays.toString(toppings));

        /** Task 6 –  Confirm the order
         *  
         *  See the workbook article for more detail  
         * 
         */

        System.out.println("Press anything to confirm your order");
        scan.nextLine();

        System.out.println("Your order is on the way!");

        

        scan.close();


         
    }
}
