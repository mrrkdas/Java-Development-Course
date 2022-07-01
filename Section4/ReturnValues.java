package Section4;

public class ReturnValues {
    public static void main(String[] args) {
        double measure1 = measureRectangle(4.3, 2.2);
        double measure2 = measureRectangle(3.2, 4.1);
        double measure3 = measureRectangle(3.5, 1.2);
        double measure4 = measureRectangle(1.6, 5.6);
        double measure5 = measureRectangle(10.1, 0.7);
        double measure6 = measureRectangle(20.2, 5.6);
        
        stringPrinter(4.3, 2.2, measure1);
        stringPrinter(3.2, 4.1, measure2);
        stringPrinter(3.5, 1.2, measure3);
        stringPrinter(1.6, 5.6, measure4);
        stringPrinter(10.1, 0.7, measure5);
        stringPrinter(20.2, 5.6, measure6);

    }

    

    
    public static double measureRectangle(double length, double width) {
        double area = length * width;

        return area;
    }

    public static void stringPrinter(double length, double width, double area) {
        System.out.println("The area of a rectangle with the length" + 
        length + " and length of" + width + "has an area of " + area);
    }
    
}
