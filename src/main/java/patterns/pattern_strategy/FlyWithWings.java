package patterns.pattern_strategy;

/**
 * Concrete strategy of the uml diagram
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }

}
