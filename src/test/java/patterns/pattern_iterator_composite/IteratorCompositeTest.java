package patterns.pattern_iterator_composite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import patterns.pattern_iterator_composite.composite.Menu;
import patterns.pattern_iterator_composite.composite.MenuComponent;
import patterns.pattern_iterator_composite.iterator.DinerMenu;
import patterns.pattern_iterator_composite.iterator.MenuItem;
import patterns.pattern_iterator_composite.iterator.PancakeHouseMenu;
import patterns.pattern_iterator_composite.iterator.Waitress;

public class IteratorCompositeTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testIteratorPattern() throws Exception {

        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        waitress.printMenu();

    }

    @Test
    public void testCompositePattern() throws Exception {

        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        dinerMenu.add(new MenuItem("Pasta", "Spaghetti with Marinara Sauce, and a slice of sourdough bread", true, 3.89));
        dinerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem("Apple Pie", "Apple Pie with a flakey crust, topped with vanilla icecream", true, 1.59));


        patterns.pattern_iterator_composite.composite.Waitress waitress = new patterns.pattern_iterator_composite.composite.Waitress(allMenus);
        waitress.printMenu();


    }

}
