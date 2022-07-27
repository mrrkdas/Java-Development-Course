package Section6;

public class ArraysAndLoops {
    public static void main(String[] args) {
        String[] kingdoms = {"Mercia", "Wessex", "Northnumbria", "EA"};

        System.out.println("The number of elements is " + kingdoms.length);

        for (int i = 0; i < kingdoms.length ; i++) {
            System.out.println("The ellement and index " + i + " is " + kingdoms[i]);
        }
    }
}
