package creationalpatterns.factorymethod;

public class CircleOS extends ButtonFactory{
    Button createButton() {
        return new CircleButton();
    }
}
