package be.intecbrussel.decorator.TreeDecorators;

import be.intecbrussel.decorator.ChristmasTree;
import be.intecbrussel.decorator.TreeDecorator;

public class TreeTopperTreeDecorator extends TreeDecorator {
    public TreeTopperTreeDecorator(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    @Override
    public String decorate() {
        return super.decorate() + " treetopper";
    }
}
