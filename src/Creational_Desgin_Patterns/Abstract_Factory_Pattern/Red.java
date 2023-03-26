package Creational_Desgin_Patterns.Abstract_Factory_Pattern;

public class Red implements Color{

    @Override
    public String getName() {
        return "RED";
    }

    @Override
    public String getFruit() {
        return "APPLE";
    }
}
