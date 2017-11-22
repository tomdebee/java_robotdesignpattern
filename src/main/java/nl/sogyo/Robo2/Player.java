package nl.sogyo.Robo2;

public class Player {
    public static void main(String[] args) {
        QueueRunner control = new QueueRunner();
        Robot roboy = new Robot();
        ICommand moveForward = new MoveForward(roboy);
        ICommand moveBackward = new MoveBackward(roboy);

        control.setCommand(moveForward);
        control.setCommand(moveForward);
        control.setCommand(moveBackward);
        control.setCommand(moveBackward);
        control.setCommand(moveBackward);
        
        control.roundOf5Execute();
        control.undo();
        control.undo();
        control.undo();
        control.undo();
        control.undo();
        control.undo();
        
        System.out.println();
        System.out.println("y = "+ roboy.getY());
    }
}