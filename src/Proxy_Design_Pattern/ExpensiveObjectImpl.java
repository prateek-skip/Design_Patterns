package Proxy_Design_Pattern;


public class ExpensiveObjectImpl implements ExpensiveObject{

    public ExpensiveObjectImpl(){
        heavyInitialProcessing();
    }
    @Override
    public void process(){
        System.out.println("Processing completed");
    }

    private void heavyInitialProcessing(){
        System.out.println("Initial configuration loading");
    }


}
