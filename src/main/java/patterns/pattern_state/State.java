package patterns.pattern_state;

/**
 * The State interface of the UML diagram / (could be also implemented as an abstract class)
 */
public interface State {

    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();

}
