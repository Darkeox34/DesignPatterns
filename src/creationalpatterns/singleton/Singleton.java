package creationalpatterns.singleton;

public class Singleton {
    private static Singleton instance = null;

    /**
     * MAIN USAGE
     * Singleton singleton = Singleton.getInstance();
     * singleton.doSomething();
    */

    private Singleton() {
        System.out.println("Creating Singleton");
    }

    public static Singleton getInstance(){
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("Singleton doSomething");
    }
}
