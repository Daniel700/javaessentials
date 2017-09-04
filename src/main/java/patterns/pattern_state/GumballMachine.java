package patterns.pattern_state;

/**
 * The context of the UML diagram
 */
public class GumballMachine {

    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;

    State state = soldOutState;
    int numberOfGumballs = 0;

    public GumballMachine(int numberOfGumballs) {
        this.numberOfGumballs = numberOfGumballs;
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);

        if (this.numberOfGumballs > 0) {
            state = noQuarterState;
        }

    }

    public void insertQuarter(){
        state.insertQuarter();
    }

    public void ejectQuarter(){
        state.ejectQuarter();
    }

    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }

    void setState(State state){
        this.state = state;
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (numberOfGumballs != 0) {
            numberOfGumballs = numberOfGumballs - 1;
        }
    }

    void refill(int numberOfGumballs){
        this.numberOfGumballs += numberOfGumballs;
        state = noQuarterState;
    }


    public int getNumberOfGumballs() {
        return numberOfGumballs;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }


    @Override
    public String toString() {
        return "Inventory: " + getNumberOfGumballs()+ " \n "
                + "Current State: " + state;
    }

}
