package patterns.pattern_state;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StateTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testStatePattern() throws Exception {
        GumballMachine gumballMachine = new GumballMachine(5);

        System.out.println(gumballMachine);
        System.out.println("");

        gumballMachine.insertQuarter();
        System.out.println(gumballMachine);
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);
        System.out.println("");

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);

    }

}
