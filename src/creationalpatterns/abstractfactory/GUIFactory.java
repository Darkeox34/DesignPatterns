package creationalpatterns.abstractfactory;

public abstract class GUIFactory {
    public abstract Button createButton();
    public abstract CheckBox createCheckBox();

    public void initialize(){
        Button button = createButton();
        CheckBox checkBox = createCheckBox();

        button.render();
        checkBox.render();
    }
}
