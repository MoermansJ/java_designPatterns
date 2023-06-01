package be.intecbrussel.observer;

public class ObserverMain {
    public static void main(String[] args) {
        //creating instances
        Company company = new Company();
        Observer influencer1 = new Influencer("A");
        Observer influencer2 = new Influencer("B");
        Observer influencer3 = new Influencer("C");


        //assigning observers to subject
        company.addObserver(influencer1);
        company.addObserver(influencer2);
        company.addObserver(influencer3);


        //creating new product and notifying observers
        company.createNewProduct("laptop");
    }
}
