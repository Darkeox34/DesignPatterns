package creationalpatterns.abstractfactory;

public class WindowsFactory extends GUIFactory{
    public Button createButton(){
        return new WindowsButton();
    }

    public CheckBox createCheckBox(){
        return new WindowsCheckBox();
    }
}
