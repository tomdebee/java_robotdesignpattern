package nl.sogyo.Robo2;

public class MoveForward implements ICommand {

    Robot robot;
    public MoveForward(Robot robot){
        this.robot = robot;
    }

    public void execute() {
        robot.moveForward();
    }
}
