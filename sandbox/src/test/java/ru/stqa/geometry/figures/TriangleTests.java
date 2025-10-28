package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {

    @Test

    void TrianglePerimeter(){
        var s = new Triangle(7,7,7);
        double result = s.perimeter();
        Assertions.assertEquals(21, result);
    }

    @Test

    void TriangleArea(){
        Assertions.assertEquals(6.928203230275509, new Triangle(4,4,4).area());
    }
}
