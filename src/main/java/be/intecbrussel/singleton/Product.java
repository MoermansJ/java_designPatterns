package be.intecbrussel.singleton;

import java.util.Objects;

public class Product {
    //properties
    private String naam;


    //constructors
    public Product(String naam) {
        this.naam = naam;
    }


    //custom methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return Objects.equals(naam, product.naam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(naam);
    }
}
