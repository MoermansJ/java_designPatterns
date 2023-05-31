package be.intecbrussel.decorator;

import be.intecbrussel.decorator.TreeDecorators.BubbleLightsTreeDecorator;
import be.intecbrussel.decorator.TreeDecorators.GarlandTreeDecorator;
import be.intecbrussel.decorator.TreeDecorators.TreeTopperTreeDecorator;

public class DecoratorMain {
    public static void main(String[] args) {
        ChristmasTree realChristmasTree = new RealChristmasTree();

        TreeDecorator bubbleLightsTreeDecorator = new BubbleLightsTreeDecorator(realChristmasTree);
        TreeDecorator garlandTreeDecorator = new GarlandTreeDecorator(bubbleLightsTreeDecorator);
        TreeDecorator treeTopperTreeDecorator = new TreeTopperTreeDecorator(garlandTreeDecorator);

        System.out.println(treeTopperTreeDecorator.decorate());
    }
}
