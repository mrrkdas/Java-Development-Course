package Section3;

import javax.print.attribute.SupportedValuesAttribute;

public class WorkBook_03_6 {
    public static void main(String[] args) {

        String day = "Friday";
        System.out.println("Hey, are you free on " + day + "? \n");
       
        System.out.println("Hmm, let me check my calendar.");

        switch (day){
            case "Monday": System.out.println("I have to work late");
            case "Tuesday": System.out.println("I have a meeting");
            case "Wednesday": System.out.println("I have to stay late");
            case "Thursday": System.out.println("I have to stay late");
            case "Friday": System.out.println("I'm free!!!");
            case "Saturday": System.out.println("I'm Free!!!");
            case "Sunday" : System.out.println("I'm Free!!!");
            default: System.out.println("That's not a real day");
        }
    }
}