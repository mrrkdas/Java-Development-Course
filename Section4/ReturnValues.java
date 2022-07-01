package Section4;

public class ReturnValues {
    public static void main(String[] args) {
        double measure1 = measureRectangle(4.3, 2.2);
        double measure2 = measureRectangle(3.2, 4.1);
        double measure3 = measureRectangle(3.5, 1.2);
        double measure4 = measureRectangle(10.1, 0.7);
        double measure5 = measureRectangle(20.2, 5.6);
        
    }

    System.out.println("The area of a rectangle with the length" + 
    4.3 + " and length of" + 2.2 + "has an area of " + measure1);

    
    public static double measureRectangle(double length, double width) {
        double area = length * width;

        return area;
    }
    
}
