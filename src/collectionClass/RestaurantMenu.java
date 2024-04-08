package collectionClass;

import java.util.HashMap;

class MenuItem {
    String name;
    double price;
    String description;

    MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }
    public String toString() {
        return "Name: " + name + ", Price: $" + price + ", Description: " + description;
    }
}

public class RestaurantMenu {
    public static void main(String[] args) {

        HashMap<String, MenuItem> menu = new HashMap<>();
        menu.put("Porotta", new MenuItem("Porotta", 2.99, "Traditional Indian food made from maida flour"));
        menu.put("Fried Rice", new MenuItem("Fried Rice", 8.99, "Stir-fried rice with vegetables and eggs"));
        menu.put("Biriyani", new MenuItem("Biriyani", 12.99, "Flavorful rice dish cooked with spices and meat"));


        // Retrieving a menu item by name
        String searchItemName = "Fried Rice";
        System.out.println("\nSearching for menu item '" + searchItemName + "':");
        boolean found = false;
        for (String itemName : menu.keySet()) {
            if (itemName.equals(searchItemName)) {
                MenuItem item = menu.get(itemName);
                System.out.println("Details of " + searchItemName + ": " + item);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(" not found.");
        }
    }
}

