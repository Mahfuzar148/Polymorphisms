public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Shape();
        shapes[1] = new Rectangle(15,15);
        shapes[2] = new Triangle(50,50);
        for(int i=0;i<3;i++)
        {
            System.out.println(shapes[i].area());

        }

    }
}
