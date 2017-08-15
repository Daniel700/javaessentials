package pattern_strategy;

/**
 * Concrete strategy of the uml diagram
 */
public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("<<< Silence >>>");
    }

}
