package be.intecbrussel.decorator;

import be.intecbrussel.decorator.ChristmasTree;

public abstract class TreeDecorator implements ChristmasTree {
    //properties
    private ChristmasTree christmasTree;


    //constructors
    public TreeDecorator(ChristmasTree christmasTree) {
        this.christmasTree = christmasTree;
    }


    //custom methods
    @Override
    public String decorate() {
        return christmasTree.decorate();
    }
}
