package structuralpatterns.decorator;

//Concrete Decorator

public class MilkDecorator extends BeverageDecorator{
    public MilkDecorator(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return decoratedBeverage.getDescription() + ", Milk";
    }

    public double getCost(){
        return decoratedBeverage.getCost() + 0.5;
    }
}
