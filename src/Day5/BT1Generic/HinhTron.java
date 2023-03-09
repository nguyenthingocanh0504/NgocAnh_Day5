package Day5.BT1Generic;

public class HinhTron implements HinhHoc{
    private double radius=1.0;

    public HinhTron() {
    }

    public HinhTron(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double tinhChuVi() {
        return Math.PI*radius*2;
    }

    @Override
    public double tinhDienTich() {
        return Math.PI*radius*radius;
    }

    @Override
    public String toString() {
        return "HinhTron{" +
                "radius=" + radius +
                '}';
    }
}
