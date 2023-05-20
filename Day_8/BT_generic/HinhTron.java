package Day_8.BT_generic;

public class HinhTron implements IHinhHoc{
    private double r = 1.0;

    public HinhTron() {
    }

    public HinhTron(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double TinhChuVi() {
        return 2*Math.PI*r;
    }

    @Override
    public double TinhDienTich() {
        return Math.PI*r*r;
    }

    @Override
    public String toString() {
        return "HinhTron[" +
                "r=" + r +
                ']';
    }
}
