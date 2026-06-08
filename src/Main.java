public class MainClass {

    public static double getArea() {
        Circle circle = new Circle();
        circle.setRadius(5);
        return Math.PI * circle.getRadius() * circle.getRadius();
    }

    public static void main(String[] args) {

        System.out.println("Area of Circle:"+getArea());

    }
}
