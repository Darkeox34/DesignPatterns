package creationalpatterns.multiton;

public class Multiton {
    static int c = 0;

    /**
     * MAIN USAGE
     * Multiton m = Multiton.getInstance();
     * m.doSomething();
    */

    private Multiton() {
        System.out.println("Multiton created");
    }

    public static Multiton getInstance() {
        if(c < 5)
            return new Multiton();
        return null;
    }

    public void doSomething() {
        System.out.println("Multiton doSomething");
    }
}
