package pattern_factory;

import pattern_factory.ingredients.Dough;
import pattern_factory.ingredients.Sauce;

import java.util.ArrayList;

/**
 * Product of the factory method uml diagram
 */
public abstract class Pizza {

    String name;
    Dough dough;
    Sauce sauce;
    ArrayList<String> toppings = new ArrayList<>();

    abstract void prepare();

    void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

}
