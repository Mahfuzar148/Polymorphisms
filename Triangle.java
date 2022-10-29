public class Triangle extends Shape {
    double base;
    double hight;

    public Triangle(double base, double hight) {
        this.base = base;
        this.hight = hight;
    }
    @Override
    public double area()
    {
        System.out.print("Area of Triangle=");
        double v = .5 * base * hight;
        return v;
    }
}
