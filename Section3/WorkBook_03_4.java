package Section3;

public class WorkBook_03_4 {
    public static void main(String[] args) {
        int temp = 25;  

        if (temp > -15 && temp < -1) {
            System.out.println("The forecast is FREEZING! Stay home!");
        } else if (temp > 0 && temp < 10) {
            System.out.println("The forecast is Chilly. Wear a coat!");
        } else {
            System.out.println("It's warm, go outside!!");
        }
    }
    
}
