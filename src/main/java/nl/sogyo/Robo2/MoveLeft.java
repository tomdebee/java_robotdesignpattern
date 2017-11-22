package nl.sogyo.Robo2;

public class MoveLeft implements ICommand {

    Robot robot;
    public MoveLeft(Robot robot){
        this.robot = robot;
    }

    public void execute() {
        robot.moveLeft();
    }
    
    public void undo() {
    	robot.moveRight();
    }
}
