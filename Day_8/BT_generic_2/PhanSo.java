package Day_8.BT_generic_2;

public class PhanSo {
   private double PhanTu = 1.0;
   private double PhanMau = 1.0;

    public PhanSo() {
    }

    public PhanSo(double phanTu, double phanMau) {
        PhanTu = phanTu;
        PhanMau = phanMau;
    }

    public double getPhanTu() {
        return PhanTu;
    }

    public void setPhanTu(double phanTu) {
        PhanTu = phanTu;
    }

    public double getPhanMau() {
        return PhanMau;
    }

    public void setPhanMau(double phanMau) {
        PhanMau = phanMau;
    }

    @Override
    public String toString() {
        return String.format("%.2f / %.2f \n", PhanTu, PhanMau);
    }
}
