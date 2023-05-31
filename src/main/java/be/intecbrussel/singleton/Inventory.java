package be.intecbrussel.singleton;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    //properties
    private static Inventory inventory;

    private static List<Product> productList;


    //constructors
    private Inventory() {
        productList = new ArrayList<>();
    }


    //getters & setters
    public List<Product> getProductList() {
        return productList;
    }


    //custom methods
    public static Inventory getInventory() {
        if (inventory == null) {
            inventory = new Inventory();
        }
        return inventory;
    }

    public void add(Product product) {
        productList.add(product);
    }

    public void remove(Product product) {
        productList = productList.stream().filter(element -> !element.equals(product)).toList();
    }
}
