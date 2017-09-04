package patterns.pattern_bridge;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BridgeTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testBridgePattern() throws Exception {

        Shape[] shapes = new Shape[] {
                new CircleShape(1, 2, 3, new DrawingAPI1()),
                new CircleShape(5, 7, 11, new DrawingAPI2())
        };

        for (Shape shape : shapes) {
            shape.resizeByPercentage(2.5);
            shape.draw();
        }

    }


}
