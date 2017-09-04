package patterns.pattern_singleton;

/**
 * Double-checked locking approach...
 * Important: the volatile keyword to ensure multiple threads handle the initialization of the instance correctly.
 */
public class SingletonThree {

    private volatile static SingletonThree instance;

    private SingletonThree(){

    }

    public static SingletonThree getInstance(){
        if (instance == null){
            synchronized (SingletonThree.class) {
                if (instance == null){
                    instance = new SingletonThree();
                }
            }
        }

        return instance;
    }



}
