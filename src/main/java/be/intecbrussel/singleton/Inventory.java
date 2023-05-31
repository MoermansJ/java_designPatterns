package be.intecbrussel.singleton;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    //properties
    private static Inventory inventory;
    private List<Product> productList;
    //productlist en andere properties NIET static zetten want deze hangen vast aan de (enige) instantie van deze klasse, de klasse heeft dan als enige property een instantie van haarzelf


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
        //not an ideal solution as we're using too much resources by converting to stream to list to ....
//        productList = productList.stream().filter(element -> !element.equals(product)).toList();
        productList.remove(product);
    }
}
