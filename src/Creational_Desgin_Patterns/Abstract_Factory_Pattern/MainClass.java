package Creational_Desgin_Patterns.Abstract_Factory_Pattern;

public class MainClass {
    public static void main(String[] args) {
        AnimalFactory animal = new AnimalFactory();
        Animal dog = animal.create("DOG");
        System.out.println(dog.makeSound());

    }
}
