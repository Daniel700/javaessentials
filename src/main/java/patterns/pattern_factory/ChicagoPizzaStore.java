package patterns.pattern_factory;

/**
 * Concrete Creator of the factory method uml diagram
 */
public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {

        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if (type.equals("cheese")){
            return new ChicagoStyleCheesePizza(ingredientFactory);
        }
        else {
            System.out.println("no pizza found");
            return null;
        }
    }
}
