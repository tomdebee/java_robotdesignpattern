package nl.sogyo.Robo2;

public class MoveBackward implements ICommand {

    Robot robot;
    public MoveBackward(Robot robot){
        this.robot = robot;
    }

    public void execute() {
        robot.moveBackward();
    }
}
