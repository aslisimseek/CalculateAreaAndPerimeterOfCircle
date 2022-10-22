import java.util.Scanner;

public class CalculateAreaAndPerimeterOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Plase Enter a radius..:");
        double radius = scanner.nextDouble();
        System.out.print("Plase Enter a center angle of circle..:");
        double centerAngle = scanner.nextDouble();
        System.out.print("Area of Circle..:" + calculateAreaOfCircle(radius));
        System.out.print("\nCircumference of Circle..:" + (100 * calculateCircumferenceOfCircle(radius)) / 100);
        System.out.print("\nArea of Cirlce..:" + calculateAreaOfCircle(radius, centerAngle));
    }

    public static double calculateAreaOfCircle(double radius) {
        return 3.14 * radius * radius;
    }

    public static double calculateCircumferenceOfCircle(double radius) {
        return 2 * 3.14 * radius;
    }

    public static double calculateAreaOfCircle(double radius, double centerAngle) {
        return (3.14 * (radius * radius) * centerAngle) / 360;
    }
}
