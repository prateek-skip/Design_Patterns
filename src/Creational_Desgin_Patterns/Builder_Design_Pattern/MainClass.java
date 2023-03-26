package Creational_Desgin_Patterns.Builder_Design_Pattern;

public class MainClass {
    public static void main(String[] args) {
        BankAccount newAccount = new BankAccount
                .BankAccountBuilder("Jon", "22738022275")
                .withEmail("jon@example.com")
                .build();
        System.out.println(newAccount.getName()+"  "+newAccount.isNewsletter());
    }
}
