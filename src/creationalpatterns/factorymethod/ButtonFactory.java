package creationalpatterns.factorymethod;

/**        *********MAIN USAGE*********
 * <p>
 *         ButtonFactory buttonFactory;
 * <p>
 *         String osType = "RectangleOS";
 * <p>
 *         if(osType.equals("CircleOS")) {
 *             buttonFactory = new CircleOS();
 *         }
 *         else if(osType.equals("RectangleOS")){
 *             buttonFactory = new RectangleOS();
 *         }
 *         else{
 *             return;
 *         }
 * <p>
 *         buttonFactory.render();
 */

/**
 * CREATOR
*/

public abstract class ButtonFactory {
    abstract Button createButton();

    public void render(){
        Button button = createButton();

        System.out.println(button.getName());
    }
}
