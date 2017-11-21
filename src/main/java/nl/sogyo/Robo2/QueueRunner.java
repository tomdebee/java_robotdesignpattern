package nl.sogyo.Robo2;

public class QueueRunner {

    private ICommand command;
    public void setCommand(ICommand command){
        this.command = command;
    }

    public void execute() {
        command.execute();
    }
}
