package patterns.pattern_flyweight;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FlyweightTest {

    private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testFlyweightPattern() throws Exception {

        for(int i=0; i < 20; ++i) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }

    }


    private String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }
    private int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private int getRandomY() {
        return (int)(Math.random()*100);
    }

}
