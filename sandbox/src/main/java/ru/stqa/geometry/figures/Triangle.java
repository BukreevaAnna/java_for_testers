package ru.stqa.geometry.figures;

public record Triangle(double side_one, double side_two, double side_three) {
    public Triangle {
        if(side_one < 0 || side_two < 0 || side_three < 0){
            throw new IllegalArgumentException("Triangle side should be non-negative");
        }else {
            if(side_one + side_two < side_three || side_one + side_three < side_two || side_two + side_three < side_one){
                throw new IllegalArgumentException("The sum of two sides of a triangle must be less than the third side");
            }

        }
    }


    public static void printTranglePerimeter(Triangle s) {
        String text = String.format("Периметр треугольника со сторонами %f, %f и %f = %f", s.side_one, s.side_two, s.side_three, s.perimeter());
        System.out.println(text);
    }

    public double perimeter() {
        return this.side_one + this.side_two + this.side_three;
    }


    public static void printTriangleArea(Triangle s) {
        String text = String.format("Площадь труегольника со сторонами %f, %f и %f = %f", s.side_one, s.side_two, s.side_three, s.area());
        System.out.println(text);

    }

    public double area() {
        double p = (this.side_one+this.side_two+this.side_three)/2;
        return Math.sqrt(p*(p-this.side_one)*(p-this.side_two)*(p-this.side_three));
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;
        return (Double.compare(this.side_one, triangle.side_one) == 0 && Double.compare(this.side_two, triangle.side_two) == 0 && Double.compare(this.side_three, triangle.side_three) == 0)
                || (Double.compare(this.side_two, triangle.side_one) == 0 && Double.compare(this.side_three, triangle.side_two) == 0 && Double.compare(this.side_one, triangle.side_three) == 0)
                || (Double.compare(this.side_three, triangle.side_one) == 0 && Double.compare(this.side_one, triangle.side_two) == 0 && Double.compare(this.side_two, triangle.side_three) == 0);
    }

    @Override
    public int hashCode() {
        int result = Double.hashCode(side_one);
        result = 31 * result + Double.hashCode(side_two);
        result = 31 * result + Double.hashCode(side_three);
        return result;
    }
}
