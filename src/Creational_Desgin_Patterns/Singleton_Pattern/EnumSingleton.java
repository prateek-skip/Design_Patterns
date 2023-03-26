package Creational_Desgin_Patterns.Singleton_Pattern;

public enum EnumSingleton {
    INSTANCE("Initial class info");


    private String info;

    private EnumSingleton(String info){
        this.info = info;
    }

    public EnumSingleton getInstance(){
        return INSTANCE;
    }

    public void setInfo(String info){
        this.info = info;
    }

    public String getInfo(){
        return this.info;
    }




}

//This approach has      guaranteed by the enum implementation itself,
//which ensures internally that only the single instance is available, correcting the problems
//pointed out in the class-based implementation.