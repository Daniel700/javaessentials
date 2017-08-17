package pattern_decorator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class DecoratorTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testDecoratorPattern() throws Exception {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new Espresso();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());


        if (beverage2 instanceof Whip)
            System.out.println("test");

    }

    @Test
    public void testCustomInputStream() throws Exception {

        int c;

        InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("src/test/resources/test.txt")));

        while ((c = in.read()) >= 0){
            System.out.println((char) c);
        }

        in.close();


    }
}
