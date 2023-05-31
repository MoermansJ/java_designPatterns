package be.intecbrussel.decorator.TreeDecorators;

import be.intecbrussel.decorator.ChristmasTree;
import be.intecbrussel.decorator.TreeDecorator;

public class GarlandTreeDecorator extends TreeDecorator {
    public GarlandTreeDecorator(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    @Override
    public String decorate() {
        return super.decorate() + " garland";
    }
}
