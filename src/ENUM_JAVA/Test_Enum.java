package ENUM_JAVA;

public class Test_Enum {

    public static void main(String[] args) {
        System.out.println("Testing enum --- ");
        givenPizaOrder_whenReady_thenDeliverable();
    }

    public static void givenPizaOrder_whenReady_thenDeliverable() {
        Pizza testPz = new Pizza();
        testPz.setStatus(Pizza.PizzaStatus.ORDERED);
//        assertTrue(testPz.isDeliverable());
        System.out.println("is pizza deliverable -- "+ testPz.isDeliverable());
        System.out.println("is Ordered -- "+ Pizza.PizzaStatus.ORDERED);
    }
}



