package creationalpatterns.factorymethod;

/**
 * CONCRETE PRODUCT B
*/

public class RectangleButton implements Button{
    String name = "Rectangle Button";

    public void click() {

    }

    public String getName(){
        return name;
    }
}
