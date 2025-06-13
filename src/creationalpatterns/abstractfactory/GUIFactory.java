package creationalpatterns.abstractfactory;

/**
 *
 * *********** MAIN USAGE **************
 * <p>
 *String os = System.getProperty("os.name");
 * <p>
 * GUIFactory factory;
 * <p>
 *         if(os.contains("Windows")){
 * factory = new WindowsFactory();
 *         }
 *                 else if(os.equals("Mac")){
 * factory = new MacFactory();
 *         }
 *                 else
 *                 return;
 *                 factory.initialize();
*/

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
