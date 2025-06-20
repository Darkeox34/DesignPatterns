package behavioralpatterns.command;

//ConcreteCommand1

public class HelpCommand implements BaseCommand{
    public void execute(){
        System.out.println("Help Command executed");
    }
}
