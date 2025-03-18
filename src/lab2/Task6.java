package lab2;

public class Task6 {
    interface Shape {
        double getArea();
        double getPerimeter();
    }

    static class Rectangle implements Shape {
        private final double length;
        private final double width;

        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        public double getArea() {
            return length * width;
        }

        public double getPerimeter() {
            return 2 * (length + width);
        }
    }

    static class Circle implements Shape {
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

    static class Triangle implements Shape {
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
            Shape rect = new Rectangle(5, 10);
            Shape circle = new Circle(7);
            Shape triangle = new Triangle(3, 4, 5);

            System.out.println("Прямоугольник: S = " + rect.getArea() + ", P = " + rect.getPerimeter());
            System.out.println("Круг: S = " + circle.getArea() + ", P = " + circle.getPerimeter());
            System.out.println("Треугольник: S = " + triangle.getArea() + ", P =  " + triangle.getPerimeter());
        }
    }

}
