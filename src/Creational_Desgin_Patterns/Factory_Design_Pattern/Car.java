package Creational_Desgin_Patterns.Factory_Design_Pattern;

public class Car implements MotorVehicle{
    @Override
    public void build(){
        System.out.println("This is car");
    }
}
