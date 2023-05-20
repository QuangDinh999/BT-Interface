package Day_8.BT_generic_2;

public class main {
    public static void main(String[] args) {
        PhanSo ps1 = new PhanSo(3,4);
        PhanSo ps2 = new PhanSo(5,9);
        ITinhToan<PhanSo> tinhPS = new ITinhToanPhanSo();
        System.out.println("Tong " + tinhPS.cong(ps1, ps2));
        System.out.println("Hieu " + tinhPS.tru(ps1, ps2));
        System.out.println("Tich " + tinhPS.nhan(ps1, ps2));
        System.out.println("Thuong " + tinhPS.chia(ps1, ps2));

    }
}
