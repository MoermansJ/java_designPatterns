package be.intecbrussel.composite;

public class CompositeMain {
    public static void main(String[] args) {
        //creating instances
        Mix mix = new Mix();
        Ingredient butter = new Butter();
        Ingredient flour = new Flour();
        Ingredient milk = new Milk();


        //adding Ingredients to mix' ingredientList
        mix.addIngredient(butter);
        mix.addIngredient(flour);
        mix.addIngredient(milk);

        
        //mixing
        mix.mix();
    }
}
