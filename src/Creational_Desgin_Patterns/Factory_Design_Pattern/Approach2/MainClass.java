package Creational_Desgin_Patterns.Factory_Design_Pattern.Approach2;


// In this approach, i tried to remove if else statements from conventional Factory Design Pattern
public class MainClass {
    public static void main(String[] args) {
        PositionFactory obj = new PositionFactory();
        IPosition temp = obj.newInstance(PositionType.MANAGER);
        System.out.println(temp.title());

        IPosition temp2 = obj.newInstance(PositionType.CLIENT);
        System.out.println(temp2.title());
    }
}
