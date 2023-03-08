package Day5.Bai6_3;

public class Circle implements GeometricObject{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 2*radius*Math.PI;
    }

    @Override
    public double getPerimeter() {
        return Math.PI*radius*radius;
    }
}
