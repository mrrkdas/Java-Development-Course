package Section4;

public class DiceJack {
    public static void main(String[] args) {
        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

        System.out.println(roll1);
        System.out.println(roll2);
        System.out.println(roll3);
    }

    public static int rollDice() {
        double randomNumber = Math.random() * 6;
        return (int) randomNumber;
    }
}
