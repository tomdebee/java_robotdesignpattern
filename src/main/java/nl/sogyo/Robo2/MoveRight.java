package nl.sogyo.Robo2;

public class MoveRight implements ICommand {

    Robot robot;
    public MoveRight(Robot robot){
        this.robot = robot;
    }

    public void execute() {
        robot.moveRight();
    }
    
    public void undo() {
    	robot.moveLeft();
    }
}
