package pattern_strategy;

/**
 * Concrete strategy of the uml diagram
 */
public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack");
    }

}
