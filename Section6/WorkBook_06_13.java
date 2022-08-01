package Section6;

public class WorkBook_06_13 {
    public static void main(String[] args) {
        //Task 1 - Create a 2D array that can store 3 rows and 5 columns of double values.
        double[][] prices = new double [3][5];

        // Task 2 - Populate your 2D array with values from the table (see article)
        prices[0][0] = 12.99;
        prices[0][1] = 8.99;
        prices[0][2] = 9.99;
        prices[0][3] = 10.49;
        prices[0][4] = 11.99;

        //row two
        prices[1][0] = 0.99;
        prices[1][1] = 1.99;
        prices[1][2] = 2.49;
        prices[1][3] = 1.49;
        prices[1][4] = 2.99;

        //row three
        prices[2][0] = 8.99;
        prices[2][1] = 7.99;
        prices[2][2] = 9.49;
        prices[2][3] = 9.99;
        prices[2][4] = 10.99;

        // Task 3 - Print the prices for each department. See the article for the expected output.  

        for (int i = 0; i < prices.length; i++) {
            switch (i) {
                case 0: System.out.print("Baking: "); break;
                case 1: System.out.print("Beverage: "); break;
                case 2: System.out.print("Cereals: "); break;
            }
            for (int j = 0; j < prices[i].length; j++) {
                System.out.print(prices[i][j] + " ");
            }
            System.out.print("\n");
        }

    }
}