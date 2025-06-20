package behavioralpatterns.chainofresponsibility;

public class NetworkLayer extends Layer{

    @Override
    public void process(String message){
        System.out.println("Network Layer : packaging data into IP packets for : '" + message + "'" );
    }
}
