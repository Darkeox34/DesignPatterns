package behavioralpatterns.chainofresponsibility;

public class TransportLayer extends Layer{

    @Override
    public void process(String message){
        System.out.println("Transport Layer: Segmenting and managing the flow for : '" + message + "'");
    }
}
