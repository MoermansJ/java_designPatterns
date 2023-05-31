package be.intecbrussel.decorator.TreeDecorators;

import be.intecbrussel.decorator.ChristmasTree;
import be.intecbrussel.decorator.TreeDecorator;

public class BubbleLightsTreeDecorator extends TreeDecorator {
    public BubbleLightsTreeDecorator(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    @Override
    public String decorate() {
        return super.decorate() + " bubblelights";
    }
}
