public class Rectangle extends Shape {
    public double l,w;
    public Rectangle(double l,double w) {
        this.l=l;
        this.w=w;
    }
    @Override
    public double area()
    {

        System.out.print("Area of Rectangle=");
        return (l*w);
    }
}
