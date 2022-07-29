package Section6;

public class WorkBook_06_6 {
    public static void main(String[] args) {
        int[] scores = {randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(),
            randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber()};
        
        System.out.print("Here are the scores: ");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }
    
        int highScore = 0;
        int i = 0;
        for (int i_ = 0; i_ < scores.length; i_++) {
            if (scores[i_] > highScore) {
                highScore = scores[i_];
                i = i_;
            }

        }

        System.out.println("The highest score is "  + highScore + " . Impressive");
        System.out.println("\n\nThe highest score is the gentleman in seat " + i + ". Give that man a cookie!");

        /** Task 1 – Find the person with the highest score
         *  
         *   • After obtaining the highest score, print: The highest score is:  <highScore>. Impressive!
         *   • It's the gentleman in seat: <index>. Give that man a cookie!
         *  
         */


    }
    
    public static int randomNumber() {
        double randomDouble = Math.random() * 50000;
        int randomInt = (int)randomDouble;
        return randomInt;
    }
}