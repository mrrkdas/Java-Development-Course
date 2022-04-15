package SectionTwo;


public class Bus {
    public static void main(String[] args) {
        int passengers = 0;
        String sentence = "Number of passengers: ";
        passengers = passengers + 9; // You can replace with passengers += 9

        System.out.println(sentence + passengers);

        passengers = passengers - 5; // You can replace with passengers -= 5

        System.out.println(sentence + passengers);

        passengers = passengers - 4; // You can replace with passengers -= 4

        System.out.println(sentence + passengers);

        // Updating the string variables
        sentence = "end of shift";

        System.out.println(sentence);
    }
    
}
