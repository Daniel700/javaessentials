package pattern_adapter_facade;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pattern_adapter_facade.adapter.Duck;
import pattern_adapter_facade.adapter.MallardDuck;
import pattern_adapter_facade.adapter.TurkeyAdapter;
import pattern_adapter_facade.adapter.WildTurkey;

public class AdapterTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testAdapterPattern() throws Exception {

        MallardDuck mallardDuck = new MallardDuck();
        WildTurkey wildTurkey = new WildTurkey();
        Duck adapter = new TurkeyAdapter(wildTurkey);

        System.out.println("The turkey says...");
        wildTurkey.gobble();
        wildTurkey.fly();
        System.out.println("");

        System.out.println("The duck says...");
        testDuck(mallardDuck);
        System.out.println("");

        System.out.println("The TurkeyAdapter says...");
        testDuck(adapter);
        System.out.println("");

    }

    void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }


}
