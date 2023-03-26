package Creational_Desgin_Patterns.Singleton_Pattern;
//The most popular approach is to implement a Singleton by creating a regular class and making sure it has:
//
//        A private constructor
//        A static field containing its only instance
//        A static factory method for obtaining the instance

public final class ClassSingleton {
        private static ClassSingleton INSTANCE;
        private String info = "Class singleton initial";

        private ClassSingleton(){

        }

        public static ClassSingleton getInstance(){
            if(INSTANCE==null){
                INSTANCE = new ClassSingleton();
            }

            return INSTANCE;
        }

    public static void setINSTANCE(ClassSingleton INSTANCE) {
        ClassSingleton.INSTANCE = INSTANCE;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
}

//    it can be problematic in multithreading scenarios