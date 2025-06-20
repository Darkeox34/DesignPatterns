package behavioralpatterns.command;

//Invoker

public class CommandHandler {
    protected BaseCommand command;

    public void setCommand(BaseCommand command) {
        this.command = command;
    }

    public void executeCommand(){
        command.execute();
    }
}
