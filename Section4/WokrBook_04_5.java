package Section4;

public class WokrBook_04_5 {

    public static void main(String[] args) {
        System.out.println("Thank you for using the area calculator");
        System.out.println("This calculator lets you get the area of: ");
        System.out.println("1 - Square\n2 - Rectangle\n3 - Triangle\n4 - Circle\n");

        
        //Task 5 – Call area functions.

        // double square = area of square with a side of 2.
        // double rectangle = area of rectangle with a length of 1, and a width of 2. 
        // double triangle = area of triangle with a base of 1, and a width of 2. 
        // double circle = area of circle with a radius of 2. 


        //Task 7 – Call a function that prints all the areas. 

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
        return 0;
    }



    //Task 6: Write a function that prints every area.


    /**
     * Function name: printAreas – it prints four areas
     * @param square – square area (double)
     * @param rectangle – rectangle area (double)
     * @param triangle – triangle area (double)
     * @param circle – circle area (double)
     * 
     * Inside the function:
     *  1. print: ("Square area: <square area>")
     *  2. print: ("Rectangle area: <rectangle area>")
     *  3. print: ("Triangle area: <triangle area>")
     *  4. print: ("Circle area: <circle area>")
     * 
     */
    }
