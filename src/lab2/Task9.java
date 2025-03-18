package lab2;

public class Task9 {
    abstract static class Shape {
        public abstract double getArea();
        public abstract double getPerimeter();
    }

    static class Circle extends Shape {
        private final double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getArea() {
            return Math.PI * radius * radius;
        }

        public double getPerimeter() {
            return 2 * Math.PI * radius;
        }
    }

    static class Square extends Shape {
        private final double side;

        public Square(double side) {
            this.side = side;
        }

        public double getArea() {
            return side * side;
        }

        public double getPerimeter() {
            return 4 * side;
        }
    }

    static class Triangle extends Shape {
        private final double a;
        private final double b;
        private final double c;

        public Triangle(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public double getArea() {
            double s = (a + b + c) / 2;
            return Math.sqrt(s * (s - a) * (s - b) * (s - c));
        }

        public double getPerimeter() {
            return a + b + c;
        }
    }

    public static class Main {
        public static void main(String[] args) {
            Circle circle = new Circle(6);
            Square square = new Square(26);
            Triangle triangle = new Triangle(2, 6, 26);

            System.out.println("Площадь круга: " + circle.getArea());
            System.out.println("Периметр круга: " + circle.getPerimeter());

            System.out.println("Площадь квадрата: " + square.getArea());
            System.out.println("Периметр квадрата: " + square.getPerimeter());

            System.out.println("Площадь треугольника: " + triangle.getArea());
            System.out.println("Периметр треугольника: " + triangle.getPerimeter());
        }
    }

}
