package Section4;

public class ReturnValues {
    public static void main(String[] args) {
        measureRectangle(4.3, 2.2);
        measureRectangle(3.2, 4.1);
        measureRectangle(3.5, 1.2);
        measureRectangle(10.1, 0.7);
        measureRectangle(20.2, 5.6);
        
    }

    public static void measureRectangle(double length, double width) {
        double area = length * width;

        System.out.println("The area of the with length " + length + " and width " + width + " rectangle is " + area);
    }
    
}
