package Creational_Desgin_Patterns.Abstract_Factory_Pattern;

public class Lion implements Animal{
    @Override
    public String getAnimal() {
        return "LION";
    }

    @Override
    public String makeSound() {
        return "ROAR";
    }
}
