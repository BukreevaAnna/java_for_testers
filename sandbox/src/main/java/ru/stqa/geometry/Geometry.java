package ru.stqa.geometry;

import ru.stqa.geometry.figures.Rectangle;
import ru.stqa.geometry.figures.Square;
import ru.stqa.geometry.figures.Triangle;

public class Geometry {
    public static void main(String[] args) {
        Square.printSquareArea(7.0);
        Square.printSquareArea(2);

        Rectangle.printRectangleArea(3.0, 5.0);

        Triangle.printTriangleArea(3.0, 4.0, 6.0);
    }


}
