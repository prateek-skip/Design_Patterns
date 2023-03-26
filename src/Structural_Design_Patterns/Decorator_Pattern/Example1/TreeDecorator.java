package Structural_Design_Patterns.Decorator_Pattern.Example1;

public abstract class TreeDecorator implements ChristmasTree {
    ChristmasTree tree;

    TreeDecorator(ChristmasTree tree){
        this.tree = tree;
    }
    @Override
    public String decorate(){
        return tree.decorate();
    }
}
