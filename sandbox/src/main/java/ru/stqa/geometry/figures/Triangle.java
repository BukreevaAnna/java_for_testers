package ru.stqa.geometry.figures;

public class Triangle {
    static double a = 4;
    static double b = 4;
    static double c = 4;

    public static void printTriangleArea() {
        String text = String.format("Площадь труегольника со сторонами %f, %f и %f = %f", a, b,c, TriangleArea(a, b, c));
        System.out.println(text);


    }

    public static double TriangleArea(double a, double b, double c) {
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }


    public static void printTranglePerimeter() {
        String text = String.format("Периметр треугольника со сторонами %f, %f и %f = %f", a, b,c, TrianglePerimeter(a, b, c));
        System.out.println(text);
    }

    public static double TrianglePerimeter(double a, double b, double c) {
        return a + b + c;
    }
}
