package creationalpatterns.factorymethod;

public class RectangleOS extends ButtonFactory{
    Button createButton() {
        return new RectangleButton();
    }
}
