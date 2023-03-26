package Creational_Desgin_Patterns.Factory_Design_Pattern.Approach2;

public class PositionFactory {
    public IPosition newInstance(PositionType validatorType) {
        return validatorType.title();
    }
}
