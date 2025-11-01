package ru.stqa.geometry.figures;



public record Square(double side) {

    public Square{
        if (side < 0 ) {
            throw new IllegalArgumentException("Не существует");
        }
    }

    public static void printSquareArea(double side){
        System.out.println(String.format("Площадь квадрата со стороной %f = %f", side, Area(side)));

    }

    public static double Area(double side) {
        return side * side;
    }

    public static double perimeter(double side) {
        return 4* side;
    }
}
