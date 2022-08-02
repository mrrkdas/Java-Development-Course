package Section6;

import java.util.Scanner;

public class Javapedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n**********Javapedia**********");
        System.out.println("How many historical figures will you register?");
        //Task 1 – Ask the user: how many historical figures will you register?
        //       – Store the value.
        int userNum = scan.nextInt();
        
        //Task 2 – Create a 2D array with a variable number of rows, and 3 values per row.         
        String[][] array = new String[userNum][3];
         
        //Watch out for the nextLine() pitfall. 
        /* Task 3 
        for (____) {

            System.out.println("\n\tFigure " + (i+1)); 

            System.out.print("\t - Name: ");
            pick up and store figure's name.   

            System.out.print("\t - Date of birth: ");
            pick up and store figure's birthday.

            System.out.print("\t - Occupation: ");
            pick up and store figure's occupation. 

            System.out.print("\n");

        } */

        for (int i = 0; i < array.length; i++){
            System.out.println("\n\tFigure " + (i+1));

            System.out.print("\t - Name: ");
            array[i][0] = scan.nextLine();
            System.out.print("\t - Date of birth: ");
            array[i][1] = scan.nextLine();
            System.out.print("\t - Occupation: ");
            array[i][2] = scan.nextLine();
            System.out.print("\n");
        }

        System.out.println("These are the values you stored:"); 
        print2DArray(array); 

        System.out.print("\nWho do you want information on? ");  
        String search = scan.nextLine();

        for (int i = 0; i < array.length; i++) {
            if (array[i][0].equals(search)) {
                System.out.println("\tName: " + array[i][0]);
                System.out.println("\tDate of birth: " + array[i][1]);
                System.out.println("\tOccupation: " + array[i][2]);
            }
        }

     
        /*Task 5: Let the user search the database by name. 
            If there's a match:
              print(    tab of space    Name: <name>)
              print(    tab of space    Date of birth: <date of birth>)
              print(    tab of space    Occupation: <occupation>)
        */        

        scan.close();
    }

    /**
     * Function name: print2DArray
     * @param array (String[][])
     * 
     * Inside the function
     *  1. print the database
     *     • a tab of space precedes each row.
     *     • each value in database has one space from the other value. 
     *     • print a new line.
     */

     public static void print2DArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++){
                System.out.println(array[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

}
