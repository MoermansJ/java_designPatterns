package be.intecbrussel.observer;

public class Influencer implements Observer {
    //properties
    private String name;


    //constructors
    public Influencer(String name) {
        this.name = name;
    }


    //custom methods
    @Override
    public void update(Product product) {
        System.out.println("I, " + this.name + ", have received " + product);
    }
}
