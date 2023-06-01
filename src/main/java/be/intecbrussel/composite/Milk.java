package be.intecbrussel.composite;

public class Milk implements Ingredient {
    @Override
    public void mix() {
        System.out.print(this);
    }

    @Override
    public String toString() {
        return "Milk";
    }
}
