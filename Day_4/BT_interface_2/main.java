package Day_4.BT_interface_2;

public class main {
    public static void main(String[] args) {
        movablepoint m1 = new movablepoint(3,6,7,8);

        System.out.println(m1.toString());
        m1.moveUp();
        System.out.println(" moveUp: "+ m1.toString());
        m1.moveDown();
        System.out.println("moveDown: "+m1.toString());
        m1.moveLeft();
        System.out.println("moveLeft: "+m1.toString());
        m1.moveRight();
        System.out.println(" moveRight: "+m1.toString());

    }
}
