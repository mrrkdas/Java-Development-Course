package Section2;

public class MathOperations {
    public static void main(String[] args) {
        int bagOfSweets1 = 5;
        int bagOfSweets2 = 10;

        long starsInMilyWay = 250000000L;
        long starsInAnromeda = 10000000000000L;

        double testScore = 6.7;
        double bonusMarks = 2.5;

        System.out.println("Fred and George collected " + (bagOfSweets1 + bagOfSweets2) + " sweets"); // You can also do the same thing with the - sign
        System.out.println("There are " + (starsInAnromeda + starsInMilyWay) + " stars in the Milky Way and Andromeda galaxies.");
        System.out.println("With bonus marks, Ron scored " + (testScore + bonusMarks) + " /10  on his potions test. Snape wasn't too thrilled");

        System.out.println("Fred has  "+ (bagOfSweets1 - bagOfSweets2)+ " more sweets than George" );
        System.out.println("The Andromeda Galaxy has " + (starsInAnromeda - starsInMilyWay)+ " more stars than the Milky Way");
        System.out.println("Snape ended up removing marks. Ron actually scored " +  (testScore - bonusMarks) + " on his potions test");
        
        System.out.println("Fred and George used a special spell to multiply their sweets to: " + (bagOfSweets1 * bagOfSweets2) + " ");
        System.out.println("Snape made an error on his excel, accidentally multiplying Ron's score to: " +  (testScore * bonusMarks) + "/ 10");

        
    }
    
    
}


// Originally, Fred had  <result> times more sweets than George
// Andromeda has <result> times more stars
// Snape caught the error. Furious, he divided Ron's score to: <result>