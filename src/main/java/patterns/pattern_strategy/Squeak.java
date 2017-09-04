package patterns.pattern_strategy;

/**
 * Concrete strategy of the uml diagram
 */
public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Squeak");
    }

}
