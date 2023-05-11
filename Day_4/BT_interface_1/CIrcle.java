package Day_4.BT_interface_1;

public class CIrcle implements GeomitricObject {
    private double radius = 1.0;

    public CIrcle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI*2*radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public String toString() {
        return "CIrcle{" +
                "radius=" + radius +
                ", Perimeter" + getPerimeter() +
                ", Area" + getArea() +
                '}';
    }
}
