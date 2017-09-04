package patterns.pattern_factory;

/**
 * Concrete Product of the factory method uml diagram
 */
public class ChicagoStyleCheesePizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public ChicagoStyleCheesePizza(PizzaIngredientFactory factory) {
        this.ingredientFactory = factory;
        name = "Chigago Style Deep Dish Cheese Pizza";
        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
    }
}
