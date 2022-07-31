package Section6;

import java.util.Arrays;

public class UpdatingArrays {
    public static void main(String[] args) {
        String[] menu = {"espresso", "iced coffee", "macchiato"};

        menu[2] = "Latte";

        System.out.println(Arrays.toString(menu));

        String[] newMenu = new String[5]; // Values are null by default

        for (int i = 0; i < menu.length; i++) {
            newMenu[i] = menu[i];
        }
        newMenu[3] = "House Blend";
        newMenu[4] = "Dark Roast";
        System.out.println(Arrays.toString(newMenu));

    }
}
