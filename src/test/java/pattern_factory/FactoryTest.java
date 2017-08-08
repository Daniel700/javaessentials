package pattern_factory;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FactoryTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void doFactoryMethodTest() throws Exception {

        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chigagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ordered a " + pizza.getName());

        System.out.println("");

        pizza = chigagoStore.orderPizza("cheese");
        System.out.println("Ordered a " + pizza.getName());

    }

}
