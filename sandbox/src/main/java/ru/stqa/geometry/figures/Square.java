package ru.stqa.geometry.figures;

public class Square {
    public static void printSquareArea(double side){
        System.out.println(String.format("Площадь квадрата со стороной %f = %f", side, Area(side)));

    }

    public static double Area(double a) {
        return a * a;
    }

    public static double perimeter(double v) {
        return 4*v;
    }
}
