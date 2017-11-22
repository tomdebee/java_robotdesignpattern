package nl.sogyo.Robo2;

public class Robot {
    private int x = 0;
    private int y = 0;


    public void moveForward() {
        y += 1;
    }

    public void moveBackward() {
        y -= 1;
    }
    
    public void moveLeft() {
        x -= 1;
    }
    
    public void moveRight() {
        x += 1;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
