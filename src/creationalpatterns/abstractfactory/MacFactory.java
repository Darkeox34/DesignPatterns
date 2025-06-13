package creationalpatterns.abstractfactory;

public class MacFactory extends GUIFactory{
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }

    public Button createButton() {
        return new MacButton();
    }
}
