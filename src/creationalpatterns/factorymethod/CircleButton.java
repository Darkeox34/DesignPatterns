package creationalpatterns.factorymethod;

public class CircleButton implements Button {
    String name = "Circle Button";

    @Override
    public void click(){
        
    }
    @Override
    public String getName(){
        return name;
    }
}
