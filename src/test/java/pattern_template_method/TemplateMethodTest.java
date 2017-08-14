package pattern_template_method;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TemplateMethodTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testTemplateMethod() throws Exception {

        CaffeineBeverage coffee = new Coffee();
        CaffeineBeverage tea = new Tea();

        coffee.prepareRecipe();
        System.out.println("");
        tea.prepareRecipe();


    }


}
