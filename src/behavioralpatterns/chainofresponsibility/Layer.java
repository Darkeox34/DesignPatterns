package behavioralpatterns.chainofresponsibility;

/**         MAIN USAGE
 *
 *         Layer application = new ApplicationLayer();
 *         Layer transport = new TransportLayer();
 *         Layer network = new NetworkLayer();
 *
 *         application.setNext(transport);
 *         transport.setNext(network);
 *
 *         String message = "Hello World!";
 *
 *         application.handle(message);
 *
*/

//Handler

public abstract class Layer {
    public Layer next;

    public void setNext(Layer next){
        this.next = next;
    }
    public void handle(String message){
        process(message);
        if(next != null){
            next.handle(message);
        }
    }

    protected abstract void process(String message);
}
