package Section6;

public class WorkBook_06_14 {
    public static void main(String[] args) {
        // Task 3 – Create a 2D array with 100 rows and 10 columns.


        /** Task 4
         * 
         * 1. Using a nested loop, populate the array with random numbers. 
         * 2. Then, pass the updated array into print2DArray.  
         * 
         */


        
    }

    /** Task 1
     * Function name: randomNumber.
     * 
     * @return randomNumber (int)
     * 
     * Inside the function:
     *    1. return a random number between 1 and 100. 
     */

     public static int randomNumber() {
        int randomNumber = (int) (Math.random() * 100) +1 ;
        return randomNumber;
     }


    /** Task 2
     * Function name: print2DArray
     * @param array ( int[][] )
     *
     * Inside the function:
     *
     *   1. prints the array such that:
     *        • Each row takes up one line.
     *        • There's a space between each value.
     */
}
