package behavioralpatterns.command;

//Command

/**         MAIN USAGE
 *
 *         CommandHandler commandHandler = new CommandHandler();
 *
 *         commandHandler.setCommand(new HelpCommand());
 *
 *         commandHandler.executeCommand();
 *
 *         commandHandler.setCommand(new PrintCommand(new Printer()));
 *
 *         commandHandler.executeCommand();
*/

interface BaseCommand {
    void execute();
}
