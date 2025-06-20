package behavioralpatterns.chainofresponsibility;

//Base Handler

public class ApplicationLayer extends Layer {
    @Override
    public void process(String message){
        System.out.println("Application Layer: Handling the request for message: '" + message + "' , sending through socket.");
    }
}
