package test.designPattern.command;

public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void doCommand() {
        command.execute();
    }
}
