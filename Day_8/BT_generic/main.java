package Day_8.BT_generic;

public class main {
    public static void main(String[] args) {
        IHinhHoc ht1 = new HinhTron();
        IHinhHoc hv = new HinhVuong();
        Drawable dr = new Drawable();

        dr.draw(ht1);
        dr.draw(hv);
    }
}
