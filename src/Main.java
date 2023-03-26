import Creational_Desgin_Patterns.Singleton_Pattern.SingletonTest;

public class Main {
    public static void main(String[] args) {
        SingletonTest test = new SingletonTest();
        System.out.println("Class Singleton Test : ----");
        test.classTest();
        System.out.println("......");
        System.out.println("Enum Singleton test: ----");
        test.enumTest();
    }




}