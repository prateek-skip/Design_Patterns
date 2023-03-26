package Creational_Desgin_Patterns.Singleton_Pattern;


public class SingletonTest {

    // Simple but not thread safe
    public void classTest(){
        ClassSingleton classSingleton1 = ClassSingleton.getInstance();
        System.out.println(classSingleton1.getInfo());


        ClassSingleton classSingleton2 = ClassSingleton.getInstance();
        classSingleton2.setInfo("New class info");

        System.out.println(classSingleton1.getInfo()); //New class info
        System.out.println(classSingleton2.getInfo());
    }


    // serialization and thread-safety in this approach
    public void enumTest(){
        EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE.getInstance();

        System.out.println(enumSingleton1.getInfo()); //Initial enum info

        EnumSingleton enumSingleton2 = EnumSingleton.INSTANCE.getInstance();
        enumSingleton2.setInfo("New enum info");

        System.out.println(enumSingleton1.getInfo()); // New enum info
        System.out.println(enumSingleton2.getInfo()); // New enum info
    }




}