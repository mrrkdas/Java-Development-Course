package Section3;

public class WorkBook_03_2 {
    public static void main(String[] args) {
        double wallet = 100;
        
        double toyCar = 5.99;
        System.out.println("Can I get this car?");
       
        if (toyCar <= wallet){
            System.out.println("Sure, pay for the toy car");
        } else {
            System.out.println("I only have" + wallet + "left");
        }

        
        double nike = 95.99;       //run test case with 89.99
        System.out.println("Can I get these nike shoes?");
        
        if (nike <= wallet) {
            System.out.println("Sure, pay for the nike shoes");
        } else {
            System.out.println("I only have" + wallet + "left");
        }
        
    }
    
}
