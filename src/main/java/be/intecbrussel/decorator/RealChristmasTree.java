package be.intecbrussel.decorator;

import be.intecbrussel.decorator.ChristmasTree;

public class RealChristmasTree implements ChristmasTree {

    @Override
    public String decorate() {
        return "christmas tree with";
    }
}
