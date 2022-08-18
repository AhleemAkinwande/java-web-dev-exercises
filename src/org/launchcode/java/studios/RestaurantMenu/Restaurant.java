package org.launchcode.java.studios.RestaurantMenu;

import java.util.ArrayList;
import java.util.Date;

public class Restaurant {
    public static void main(String[] args) {
        ArrayList<MenuItem> myMenu = new ArrayList<>();

        MenuItem royalWithCheese = new MenuItem("Royal with Cheese", 18.99, "A French Quarter - Pounder", "Main Course");
        MenuItem krabbyPatty = new MenuItem("Krabby Patty", 40.00, "Plankton and Crab Meat Patty", "Main Course");
        MenuItem food = new MenuItem("Food", 10.34, "Barely meets the requirements of food, but edible", "Appetizer");

        myMenu.add(royalWithCheese);
        myMenu.add(krabbyPatty);
        myMenu.add(food);

        Menu todaysMenu = new Menu(myMenu);

        MenuItem pizza = new MenuItem("Pizza", 2.01, "Basic slice of cheese 'za", "Dessert");

        //todaysMenu.remove();
//        System.out.println();
        todaysMenu.add(pizza);
        //todaysMenu.showAll();
        todaysMenu.showItem();
        //todaysMenu.showLastUpdated();


    }
}
