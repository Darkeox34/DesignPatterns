package creationalpatterns.factorymethod;

/**
 * CONCRETE CREATOR B
 */

public class RectangleOS extends ButtonFactory{
    Button createButton() {
        return new RectangleButton();
    }
}
