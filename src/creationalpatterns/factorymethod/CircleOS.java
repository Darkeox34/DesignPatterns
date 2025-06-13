package creationalpatterns.factorymethod;

/**
 * CONCRETE CREATOR A
*/

public class CircleOS extends ButtonFactory{
    Button createButton() {
        return new CircleButton();
    }
}
