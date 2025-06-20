package structuralpatterns.decorator;


/**         MAIN USAGE
 *
 *         Beverage beverage = new BasicCoffee();
 *
 *         System.out.println(beverage.getDescription());
 *         System.out.println(beverage.getCost());
 *
 *         beverage = new MilkDecorator(new SugarDecorator(beverage));
 *
 *         System.out.println(beverage.getDescription());
 *         System.out.println(beverage.getCost());
*/

//Decorator

abstract class BeverageDecorator implements Beverage{
    protected Beverage decoratedBeverage;

    public BeverageDecorator(Beverage beverage) {
        this.decoratedBeverage = beverage;
    }

    public String getDescription() {
        return decoratedBeverage.getDescription();
    }

    public double getCost() {
        return decoratedBeverage.getCost();
    }
}
