package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {

    @Test

    void TrianglePerimeter(){
        Assertions.assertEquals(24, Triangle.TrianglePerimeter(6, 8, 10));
    }

    @Test

    void TriangleArea(){
        Assertions.assertEquals(6.928203230275509, Triangle.TriangleArea(4,4,4));
    }
}
