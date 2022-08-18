package org.launchcode.java.studios.RestaurantMenu;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Menu {
    Scanner input = new Scanner(System.in);

    private ArrayList<MenuItem> items;
    private Date lastUpdated;

    public Menu(ArrayList<MenuItem> items) {
        this.items = items;
        this.lastUpdated = new Date();
    }

    public void add(MenuItem item) {
        this.items.add(item);
    }

    public void addItem() {
        System.out.println("Enter new menu item");
        String name = input.nextLine();
        MenuItem userItem = new MenuItem(name, 10.45, "New Food item", "Appetizer");

        this.items.add(userItem);
    }

    public void simpleRemove(MenuItem item) {
        this.items.remove(item);
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) { this.lastUpdated = lastUpdated; }

    public void showLastUpdated() {
        System.out.println(String.format("The menu was last updated on: %s", this.getLastUpdated()));
    }

    public void remove() {
        System.out.println("Select number corresponding to the menu item you would like to remove");
        this.showAll();
        int indexToDelete = input.nextInt();
        input.close();

        this.items.remove(indexToDelete);
    }

    public void showAll() {
        for (int i = 0; i < this.items.size(); i++) {
            MenuItem theItem = this.items.get(i);
            System.out.println(String.format("%s) %s: %s", i, theItem.getName(), theItem.getPrice()));
        }
    }

}
