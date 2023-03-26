package Creational_Desgin_Patterns.Abstract_Factory_Pattern;

public interface AbstractFactory<T> {
    T create(String animalType);
}
