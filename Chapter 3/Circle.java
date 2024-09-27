public class Circle {

    static double radius;
    static double diameter;
    static double area;

    public Circle() {
        radius = 1.0;
        diameter = 2 * radius;
        area = Math.PI * radius * radius;
    }

    public static void setRadius(double rad) {
        radius = rad;
        diameter = 2 * radius;
        area = Math.PI * radius * radius;
    }

    public static double getRadius() {
        return radius;
    }

    public static double getDiameter() {
        return diameter;
    }

    public static double getArea() {
        return area;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();

        System.out.println("Initial radius: " + Circle.getRadius());
        System.out.println("Initial diameter: " + Circle.getDiameter());
        System.out.println("Initial area: " + Circle.getArea());

        Circle.setRadius(5.0);

        System.out.println("Updated radius: " + Circle.getRadius());
        System.out.println("Updated diameter: " + Circle.getDiameter());
        System.out.println("Updated area: " + Circle.getArea());
    }
}