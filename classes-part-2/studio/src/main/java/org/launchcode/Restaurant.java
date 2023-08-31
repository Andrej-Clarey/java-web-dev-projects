package org.launchcode;
import java.util.Arrays;
import java.util.Date;

import java.util.ArrayList;

public class Restaurant {
    public static void main(String[] args) {
        MenuItem aMenuItem = new MenuItem(13.23, "Chicken", "main course", true);
        MenuItem bMenuItem = new MenuItem(5.63, "Pie", "dessert", false);
        MenuItem cMenuItem = new MenuItem(10.45, "wings", "appetizer", true);
        MenuItem dMenuItem = new MenuItem(3.5, "grilled cheese", "main course", false);

        ArrayList<MenuItem> dinner = new ArrayList<>(Arrays.asList(aMenuItem, bMenuItem, cMenuItem, dMenuItem));
        Menu dinnerMenu = new Menu(new Date(), dinner);

        System.out.println(dinnerMenu);
        dinner.remove(aMenuItem);
        System.out.println(dinnerMenu);
        dinner.add(aMenuItem);
        System.out.println(dinnerMenu);
        System.out.println();
    }
}
