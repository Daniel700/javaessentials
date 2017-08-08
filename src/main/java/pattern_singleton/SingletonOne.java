package pattern_singleton;

/**
 * This singleton is thread-safe but expensive due to synchronized.
 *
 * Drawback: each time the getInstance method is called we lock the method...
 * Actually it is only needed the first time the method is called
 */
public class SingletonOne {

    private static SingletonOne instance;

    private SingletonOne(){}

    public static synchronized SingletonOne getInstance() {
        if (instance == null){
            instance = new SingletonOne();
        }
        return instance;
    }

    //other methods...

}
