package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.stqa.geometry.figures.Square;

public class SquareTests {

    @Test

    void canCalculateArea(){
        Assertions.assertEquals(25.0, Square.Area(6.0));
    }

    @Test
    void canCalculatePerimeter(){
        Assertions.assertEquals(20.0, Square.perimeter(5.0));
    }

    @Test
    void cannotCreateSquareWithNegativeSide() {
        try {
            new Square(-5.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {
            // OK
        }
    }

    @Test
    void testEquality(){
        var s1 = new Square(4);
        var s2 = new Square(4);
        Assertions.assertEquals(s1, s2);
    }

    @Test
    void testNotEquality(){
        var s1 = new Square(5);
        var s2 = new Square(4);
        Assertions.assertNotEquals(s1, s2);
    }


    @Test
    void testFail(){
        var s1 = new Square(5);
        var s2 = new Square(5);
        Assertions.assertTrue(s1.equals(s2));
    }
}
