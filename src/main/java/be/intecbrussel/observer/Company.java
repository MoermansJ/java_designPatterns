package be.intecbrussel.observer;

import java.util.ArrayList;
import java.util.List;

public class Company implements Subject {
    //properties
    private List<Observer> observerList;
    private Product product;


    //constructors
    public Company() {
        this.observerList = new ArrayList<>();
        this.product = new Product("");
    }


    //custom methods
    public void createNewProduct(String productName) {
        this.product = new Product(productName);
        notifyObservers(this.product);
    }

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers(Product product) {
        observerList.forEach(observer -> observer.update(product));
    }

}
