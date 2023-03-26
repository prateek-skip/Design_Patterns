package Creational_Desgin_Patterns.Abstract_Factory_Pattern;

public class ColorFactory implements AbstractFactory<Color>{
    @Override
    public Color create(String colorType) {
        if ("Red".equalsIgnoreCase(colorType)) {
            return new Red();
        } else if ("Orange".equalsIgnoreCase(colorType)) {
            return new Orange();
        }

        return null;
    }
}
