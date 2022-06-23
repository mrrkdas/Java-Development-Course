package Section3;

public class challenge_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("1. Which country held the 2016 Summer Olympics?");
        System.out.println("\ta) China\n\tb) Ireland\n\tc) Brazil\n\td) Italy\n");
        String answer1 = scan.nextLine();

        System.out.println("\n2. Which planet is the hottest?");
        System.out.println("\ta) Venus\n\tb) Saturn\n\tc) Mercury\n\td) Mars\n");
        String answer2 = scan.nextLine();

        System.out.println("\n3. What is the rarest blood type?");
        System.out.println("\ta) O\n\tb) A\n\tc) B\n\td) AB-Negative\n");
        String answer3 = scan.nextLine();

        System.out.println("\n4. Which one of these characters is friends with Harry Potter?");
        System.out.println("\ta) Ron Weasley\n\tb) Hermione Granger\n\tc) Draco Malfoy\n");
        String answer4 = scan.nextLine();

        int score = 0;


        switch (answer1) {
            case "a" : System.out.println("Wrong Answer"); break;
            case "b" : System.out.println("Wrong Answer"); break;
            case "c" : score += 5; break; 
            case "d" : System.out.println("Wrong Answer"); break;
            default : System.out.println("Thats not a valid answer");
        }

        switch (answer2) {
            case "a" : score += 5; break; 
            case "b" : System.out.println("Wrong Answer"); break;
            case "c" : System.out.println("Wrong Answer"); break;
            case "d" : System.out.println("Wrong Answer"); break;
            default : System.out.println("Thats not a valid answer");
        }

        switch (answer3) {
            case "a" : System.out.println("Wrong Answer"); break;
            case "b" : System.out.println("Wrong Answer"); break;
            case "c" : System.out.println("Wrong Answer"); break;
            case "d" : score += 5; break; 
            default : System.out.println("Thats not a valid answer");
        }

        switch (answer4) {
            case "a" : System.out.println("Wrong Answer"); break;
            case "b" : score += 5; break; 
            case "c" : System.out.println("Wrong Answer"); break;
            default : System.out.println("Thats not a valid answer");
        }
        
        System.out.println("Your final score is: " + score + "/20");

        //Task 3: print a message depending on the score

        // if the score is 15 or higher, print: "Wow, you know your stuff!";
        // if the score is between 5 and 15, print "Not bad!";
        // else, better luck next time. 


        scan.close();
    }
}