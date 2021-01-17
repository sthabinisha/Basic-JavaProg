public class TaskSixThree {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println("Rectangele area: "+ rectangle.getArea(new Rectangle(8,9)));
        System.out.println("Rectangele area: "+ rectangle.getArea(new Rectangle(8)));
        System.out.println("Rectangele area: "+ rectangle.getArea(rectangle));

    }
}

class Rectangle{

    private  float length;
    private float breadth;

    public Rectangle() {
        this.length = 0;
        breadth = 0;
    }

    public Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public Rectangle(float length) {
        this.length = length;
        this.breadth = length;
    }

    public float getArea(Rectangle rectangle) {
        return  rectangle.length * rectangle.breadth;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", breadth=" + breadth +
                '}';
    }
}
