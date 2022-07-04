package Section4;

public class DocComments {
    public static void main(String[] args) {
        
    }

    /** 
     * Function name: greet
     * 
     * Inside the function"
     * 1. prints: "hi"
     * 
     */

    public static void greet() {
        System.out.println("Hi");
    }

    /**
     * Function name: printText()
     * @param name (String)
     * @param age (String)
     * 
     * 
     * Inside the function: 
     *  1. thsi function prints the name the age as part of a task
     * 
     */

    public static void printText(String name, String age) {
        System.out.println("Hi I'm " + name + "and I'm " + age + "year old");
    }

    /**
     * Function name: calculateArea
     * @param length (double)
     * @param width (double)
     * @return (double)
     * 
     * Inside the function:
     *  1. this function calculates the area through two params
     * 
     */

    public static double calculateArea(double length, double width) {
        double area = length * width;

        return area;
    }
}