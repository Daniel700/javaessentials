package pattern_iterator_composite.iterator;

/**
 * Client of the UML diagram
 */
public class Waitress {

    //PancakeHouseMenu pancakeHouseMenuInterface;
    //DinerMenu dinerMenuInterface;
    MenuInterface pancakeHouseMenuInterface;
    MenuInterface dinerMenuInterface;


    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenuInterface = pancakeHouseMenu;
        this.dinerMenuInterface = dinerMenu;
    }

    public void printMenu(){
        //Iterator pancakeIterator = pancakeHouseMenuInterface.createIterator();
        //Iterator dinerIterator = dinerMenuInterface.createIterator();
        java.util.Iterator pancakeIterator = pancakeHouseMenuInterface.createNativeIterator();
        java.util.Iterator dinerIterator = dinerMenuInterface.createNativeIterator();
        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerIterator);
    }

    private void printMenu(Iterator iterator){
        while (iterator.hasNext()){
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName() + ", ");
            System.out.println(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }

    private void printMenu(java.util.Iterator iterator){
        while (iterator.hasNext()){
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName() + ", ");
            System.out.println(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }

}
