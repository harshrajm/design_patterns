package creational_patterns.singleton;


//Here using synchronized makes sure that only one thread at a time can execute getInstance().

//The main disadvantage of this is method is that using synchronized every time while creating
// the singleton object is expensive and may decrease the performance of your program.
public class SynchronizedSingleton {
    private static SynchronizedSingleton obj;

    private SynchronizedSingleton() {}

    // Only one thread can execute this at a time
    public static synchronized SynchronizedSingleton getInstance()
    {
        if (obj==null)
            obj = new SynchronizedSingleton();
        return obj;
    }

}
