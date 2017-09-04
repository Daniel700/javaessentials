package patterns.pattern_singleton;

/**
 * This approach creates the singleton eagerly instead of lazily.
 * (When the class is loaded from the JVM the singleton is created)
 */
public class SingletonTwo {

    private static SingletonTwo instance = new SingletonTwo();

    private SingletonTwo(){

    }

    public static SingletonTwo getInstance(){
        return instance;
    }

}
