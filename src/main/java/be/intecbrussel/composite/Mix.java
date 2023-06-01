package be.intecbrussel.composite;

import java.util.ArrayList;
import java.util.List;

public class Mix implements Ingredient {
    //properties
    private List<Ingredient> ingredientList;


    //constructors
    public Mix() {
        this.ingredientList = new ArrayList<>();
    }


    //custom methods
    public void addIngredient(Ingredient ingredient) {
        this.ingredientList.add(ingredient);
    }

    @Override
    public void mix() {
        System.out.print("Mixing: ");
        ingredientList.forEach(Ingredient::mix);
    }
}
