package Day_4.BT_interface_1;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<GeomitricObject> geo = new ArrayList<>();
        CIrcle c1 = new CIrcle(4);
        Rectangle r1 = new Rectangle(4,6);
        geo.add(c1);
        geo.add(r1);

        for (GeomitricObject g : geo){
            System.out.println(g);
        }
    }
}
