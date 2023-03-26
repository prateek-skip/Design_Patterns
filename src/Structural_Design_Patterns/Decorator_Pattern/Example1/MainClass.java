package Structural_Design_Patterns.Decorator_Pattern.Example1;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class MainClass {


    @Test
    public void whenDecoratorsInjectedAtRuntime_thenConfigSuccess() {
        ChristmasTree tree1 = new Garland(new ChristmasTreeImpl());
        assertEquals(tree1.decorate(),
                "Christmas tree with Garland");

        ChristmasTree tree2 = new BubbleLights(
                new Garland(new Garland(new ChristmasTreeImpl())));
        assertEquals(tree2.decorate(),
                "Christmas tree with Garland with Garland with Bubble lights");
    }
}
