package nl.sogyo.Robo2;

public class Player {
    public static void main(String[] args) {
        QueueRunner control = new QueueRunner();
        Robot roboy = new Robot();
        ICommand moveForward = new MoveForward(roboy);
        ICommand moveBackward = new MoveBackward(roboy);
        CommandQueue queue = new CommandQueue();

        queue.addCommand(new MoveForward(roboy));



        control.setCommand(moveForward);
        control.execute();

        control.setCommand(moveForward);
        control.execute();

        control.setCommand(moveBackward);
        control.execute();

        System.out.println();
        System.out.println("y = "+ roboy.getY());
    }
}