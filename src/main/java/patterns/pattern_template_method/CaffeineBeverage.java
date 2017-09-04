package patterns.pattern_template_method;

public abstract class CaffeineBeverage {

    final void prepareRecipe(){

        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()){
            addCondiments();
        }

    }

    abstract void brew();
    abstract void addCondiments();

    final void boilWater(){
        System.out.println("Boiling Water");
    }

    final void pourInCup(){
        System.out.println("Pouring into cup");
    }

    // This is a hook. Subclasses are free to override it but don't have to.
    // (optional part of an algorithm)
    boolean customerWantsCondiments(){
        return true;
    }

}
