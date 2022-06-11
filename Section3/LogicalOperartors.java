package Section3;

public class LogicalOperartors {
    public static void main(String[] args) {
        int chemistryGrade = 67;
        int englishGrade = 65;
        String language = "Java";

        if (chemistryGrade > 75 || englishGrade > 75 || language.equals("Java")) {
            System.out.println("Congrats you got the scholarship");
        } else {
            System.out.println("You didn't get the scholarship");
        }

        int credits = 56;
        double GPA = 3.2;

        if (credits >= 40 && GPA >= 2.0)   {
            System.out.println("You got your diploma");
        } else {
            System.out.println("Sorry we need you to have at least 40 credits and a GPA of 2.0");
        }
    }
}
