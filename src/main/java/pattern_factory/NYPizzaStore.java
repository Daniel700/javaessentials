package pattern_factory;

/**
 * Concrete Creator of the factory method uml diagram
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {

        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (type.equals("cheese")){
            return new NYStyleCheesePizza(ingredientFactory);
        }
        else {
            System.out.println("no pizza found");
            return null;
        }
    }

}
