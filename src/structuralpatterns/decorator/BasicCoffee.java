package structuralpatterns.decorator;

//Concrete Component

public class BasicCoffee implements Beverage {
    public String getDescription(){
        return "Basic Coffee";
    }

    public double getCost(){
        return 1.0;
    }
}
