package Singleton;

public class MyObject {
    private static MyObject uniqueInstance;

    private  MyObject(){}

    public static MyObject getInstance(){ //getInstance()------- Permiteaos clientes acessarem a instancia única
        if (uniqueInstance == null){
            uniqueInstance = new MyObject();
        }
        return uniqueInstance;
    }
}
