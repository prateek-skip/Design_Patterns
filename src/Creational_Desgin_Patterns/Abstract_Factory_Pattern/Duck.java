package Creational_Desgin_Patterns.Abstract_Factory_Pattern;

public class Duck implements Animal{
    @Override
    public String getAnimal() {
        return "DUCK";
    }

    @Override
    public String makeSound() {
        return "QUACK QUACK";
    }
}
