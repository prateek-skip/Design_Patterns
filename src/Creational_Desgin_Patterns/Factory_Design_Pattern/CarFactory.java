package Creational_Desgin_Patterns.Factory_Design_Pattern;

public class CarFactory extends MotorVehicleFactory{
    @Override
    protected MotorVehicle createMotorVehicle() {
        return new Car();
    }
}
