package Day_8.BT_generic;

public class HinhVuong implements IHinhHoc{
    private double length = 1.0;
    private double width = 1.0;

    public HinhVuong() {
    }

    public HinhVuong(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double TinhChuVi() {
        return (length + width) * 2;
    }

    @Override
    public double TinhDienTich() {
        return length*width;
    }

    @Override
    public String toString() {
        return "HinhVuong[" +
                "length=" + length +
                ", width=" + width +
                ']';
    }
}
