package creational_patterns.singleton;


//Use this method only when your singleton class is light and is used throughout the execution of your program.
public class EagerSingleton {
    private static EagerSingleton obj = new EagerSingleton();

    private EagerSingleton() {}

    public static EagerSingleton getInstance()
    {
        return obj;
    }
}
