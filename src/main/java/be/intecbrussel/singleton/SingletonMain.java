package be.intecbrussel.singleton;

public class SingletonMain {
    public static void main(String[] args) {
        Inventory inventory1 = Inventory.getInventory();
        Inventory inventory2 = Inventory.getInventory();

        Product appelsiensap = new Product("Appelsiensap");
        Product sinaasappelsap = new Product("Sinaasappelsap");

        inventory1.add(appelsiensap);
        inventory2.add(sinaasappelsap);

        System.out.println(inventory1.getProductList());
        System.out.println(inventory2.getProductList());

        inventory1.remove(sinaasappelsap); //removing a product added to inventory2

        System.out.println(inventory1.getProductList());
        System.out.println(inventory2.getProductList());
    }
}
