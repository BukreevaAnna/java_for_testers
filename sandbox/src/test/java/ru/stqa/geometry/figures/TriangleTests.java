package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {

    @Test

    void cannotCreateTriangleWithNegativeSide(){
        try {
            new Triangle(5.0, 3.0, -6.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {
            // OK
        }
    }

    @Test

    void checkungTheTriangleInequality(){
        try {
            new Triangle(5.0, 3.0, 6.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {
            // OK
        }
    }

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
