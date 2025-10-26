import java.awt.*;

public class Geometry {
    public static void main(String[] args) {
        printSquareArea(7.0);
        printSquareArea(2);


        printRectangleArea(3.0, 5.0);
    }

    private static void printRectangleArea(double a, double b) {
        System.out.println("Площадь прямоугольника со сторонами " + a + " и "+ b + " = " + RectangleArea(a, b));
    }

    private static double RectangleArea(double a, double b) {
        return a * b;
    }


    static void printSquareArea(double side){
        System.out.println("Площадь квадрата со стороной " + side + " = " + squareArea(side));

    }

    private static double squareArea(double a) {
        return a * a;
    }
}
