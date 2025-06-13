import creationalpatterns.abstractfactory.GUIFactory;
import creationalpatterns.abstractfactory.MacFactory;
import creationalpatterns.abstractfactory.WindowsFactory;
import creationalpatterns.factorymethod.ButtonFactory;
import creationalpatterns.factorymethod.CircleOS;
import creationalpatterns.factorymethod.RectangleOS;
import creationalpatterns.multiton.Multiton;
import creationalpatterns.singleton.Singleton;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        String os = System.getProperty("os.name");

        GUIFactory factory;

        if(os.contains("Windows")){
            factory = new WindowsFactory();
        }
        else if(os.equals("Mac")){
            factory = new MacFactory();
        }
        else
            return;
        factory.initialize();
    }
}