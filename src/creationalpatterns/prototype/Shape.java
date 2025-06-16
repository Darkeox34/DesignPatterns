package creationalpatterns.prototype;

/**
 *         MAIN USAGE
 * <p>
 *         Rectangle rect = new Rectangle();
 * <p>
 *         rect.width = 10;
 *         rect.height = 15;
 * <p>
 *         System.out.println(rect.getSize());
 * <p>
 *         Rectangle rect2 = rect.clone();
 * <p>
 *         System.out.println(rect2.getSize());
*/

public abstract class Shape {
    int x, y;
    public Shape(){

    }

    public Shape(Shape source) {
        this.x = source.x;
        this.y = source.y;
    }

    public abstract Shape clone();
}
