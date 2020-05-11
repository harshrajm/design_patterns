package creational_patterns.singleton;

public class SingletonDoubleChecking {

    private volatile static SingletonDoubleChecking obj;

    private SingletonDoubleChecking() {}

    public static SingletonDoubleChecking getInstance()
    {
        if (obj == null)
        {
            // To make thread safe
            synchronized (SingletonDoubleChecking.class)
            {
                // check again as multiple threads
                // can reach above step
                if (obj==null)
                    obj = new SingletonDoubleChecking();
            }
        }
        return obj;
    }
}
