package ru.stqa.geometry.figures;

public class Triangle {

    public static void printTriangleArea(double a, double b, double c) {
        String text = String.format("Площадь треугольника со сторонами %f, %f и %f = %f", a, b,c, TriangleArea(a, b, c));
        System.out.println(text);


    }

    private static double TriangleArea(double a, double b, double c) {
        return (a+b+c)/2;
    }
}
