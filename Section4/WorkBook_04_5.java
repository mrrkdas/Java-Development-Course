package Section4;

public class WorkBook_04_5 {

    public static void main(String[] args) {
        System.out.println("Thank you for using the area calculator");
        System.out.println("This calculator lets you get the area of: ");
        System.out.println("1 - Square\n2 - Rectangle\n3 - Triangle\n4 - Circle\n");

        
        //Task 5 – Call area functions.

        double square = areaSquare(2);
        double rectangle = areaRectangle(2, 1);
        double triangle = areaTriangle(2, 1);
        double circle = areaCircle(2);


        //Task 7 – Call a function that prints all the areas. 
        printAreas(square, rectangle, circle, triangle);

    }

    public static double areaSquare(double side) {
        if (side > 0) {
            double area = Math.pow(side, 2);
            return area;
        } else {
            System.out.println("That is not a valid number"); 
        }        
        return 0;
    }


    public static double areaRectangle(double length, double width) {
        if (length > 0 && width > 0) {
            double area = length * width;
            return area;
        } else {
            return 0;  
        } 
    } 

    public static double areaTriangle(double base, double height) {
        if (base > 0 && height > 0) {
            double area = 0.5 * base * height;
            return area;
        } else {
            return 0;
        }
    }


    public static double areaCircle(double radius) {
        if (radius > 0) {
        double area = Math.PI * radius * 2;
        return area;
    } else {
    } return 0; }




    
    public static void printAreas(double square, double rectangle, double circle, double triangle) {
        System.out.println("Square area: " + square);
        System.out.println("Rectangle area: " + rectangle);
        System.out.println("Traingle area: " + triangle);
        System.out.println("Circle area: " + circle);

    }






    }

