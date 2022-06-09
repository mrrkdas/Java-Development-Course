package Section3;

public class IfElse {
    public static void main(String[] args) {
        int Grade = 65;

        if (Grade >= 80) {
            System.out.println("You got an A");
        } else if (Grade >= 70) {
            System.out.println("You got a B");
        } else if (Grade >= 60) {
            System.out.println("You got a C");
        } else if (Grade > 50) {
            System.out.println("You got a D");
        }
        
        else {
            System.out.println("Study hard next time");
        }
        
    }
}