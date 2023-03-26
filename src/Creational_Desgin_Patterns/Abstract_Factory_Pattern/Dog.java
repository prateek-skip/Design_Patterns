package Creational_Desgin_Patterns.Abstract_Factory_Pattern;

public class Dog implements Animal{
    @Override
    public String getAnimal() {
        return "DOG";
    }

    @Override
    public String makeSound() {
        return "BARK";
    }
}
