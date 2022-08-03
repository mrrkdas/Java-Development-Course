package Section7;

public class Main {
    public static void main(String[] args) {
        Car nissan = new Car();

        nissan.make = "Nissan";
        nissan.price = 5000;
        nissan.year = 2020;
        nissan.color = "Red";

        System.out.println("This " +  nissan.make + " is worth "  + nissan.price +  " it was built in "  + nissan.year +  " It is a "  + nissan.color + " car");

    }
}