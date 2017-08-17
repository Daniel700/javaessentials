package pattern_builder;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BuilderTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testBuilderPattern() throws Exception {
        Person person = new Person.Builder("Daniel")
                .withAge(22)
                .withHeight(170)
                .withWeight(70)
                .build();

        System.out.println(person);
    }

}
