package Section6;

import java.util.Arrays;

public class UpdatingArrays {
    public static void main(String[] args) {
        String[] menu = {"espresso", "iced coffee", "macchiato"};

        menu[2] = "Latte";

        System.out.println(Arrays.toString(menu));
    }
}
