package structuralpatterns.decorator;

//Concrete Decorator

public class SugarDecorator extends BeverageDecorator{
    public SugarDecorator(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return super.getDescription() + ", Sugar";
    }

    public double getCost() {
        return super.getCost() + 0.5;
    }
}
