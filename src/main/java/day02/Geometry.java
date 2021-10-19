package day02;

public class Geometry {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2.5, 10);
        System.out.println(rectangle.calculateArea());

        Rectangle rectangle2 = new Rectangle(30, 40);
        System.out.println(rectangle2.calculateArea());
    }
}
