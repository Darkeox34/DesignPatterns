package behavioralpatterns.command;

//ConcreteConcrete2

public class PrintCommand implements BaseCommand{
    Printer printer;

    public PrintCommand(Printer printer) {
        this.printer = printer;
    }

    public void execute(){
        printer.print();
    }
}
