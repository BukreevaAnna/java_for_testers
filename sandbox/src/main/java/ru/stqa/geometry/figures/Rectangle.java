package ru.stqa.geometry.figures;

public record Rectangle(double a, double b) {
    public Rectangle {
        if(a<0 || b< 0){
            throw new IllegalArgumentException("Rectangle side should be non-negative");
        }
    }

    public static void printRectangleArea(double a, double b) {
        String text = String.format("Площадь прямоугольника со сторонами %f и %f = %f", a, b, RectangleArea(a, b));
        System.out.println(text);
    }

    private static double RectangleArea(double a, double b) {
        return a * b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rectangle rectangle = (Rectangle) o;
        return (Double.compare(this.a, rectangle.a) == 0 && Double.compare(this.b, rectangle.b) == 0)
                || (Double.compare(this.b, rectangle.a) == 0 && Double.compare(this.a, rectangle.b) == 0);
    }

    @Override
    public int hashCode() {
        int result = Double.hashCode(a);
        result = 31 * result + Double.hashCode(b);
        return result;
    }
}
