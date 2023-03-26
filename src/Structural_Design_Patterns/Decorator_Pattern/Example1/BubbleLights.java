package Structural_Design_Patterns.Decorator_Pattern.Example1;

public class BubbleLights extends TreeDecorator{
    public BubbleLights(ChristmasTree tree){
        super(tree);
    }

    public String decorate(){
        return super.decorate() + decorateWithBubbleLights();
    }

    private String decorateWithBubbleLights() {
        return " with Bubble lights";
    }
}
