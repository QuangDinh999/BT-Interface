package Day_4.BT_interface_2;

public class movablepoint implements Movable {
    int x,y;
    int xSpeed, ySpeed;

    public movablepoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
       y-=ySpeed;
    }

    @Override
    public void moveDown() {
        y+=ySpeed;
    }

    @Override
    public void moveLeft() {
        x-=xSpeed;
    }

    @Override
    public void moveRight() {
        x+=xSpeed;
    }

    @Override
    public String toString() {
        return "movablepoint{" +
                 "(" + x + ", " +
                "" + y +  ")" +
                " speed=" +
                "( " + xSpeed +
                ", " + ySpeed + ")" +
                '}';
    }
}
