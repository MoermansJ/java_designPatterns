package be.intecbrussel.observer;

public class Product implements Observer {
    //properties
    private String name;


    //constructors
    public Product(String name) {
        this.name = name;
    }


    //custom methods
    @Override
    public void update(Product product) {
        System.out.println("I have received " + product);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }
}
