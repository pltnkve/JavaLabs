package lab2;

public class Task5 {
    static class Rectangle {
        private int length;
        private int width;

        public Rectangle(int length, int width) {
            this.length = length;
            this.width = width;
        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public int getArea() {
            return length * width;
        }

        public int getPerimeter() {
            return 2 * (length + width);
        }

        public static void main(String[] args) {
            Rectangle rect = new Rectangle(5, 10);
            rect.setLength(6);
            rect.setWidth(2);
            System.out.println("Прямоугольник размерами " + rect.getLength() + " x " + rect.getWidth());
            System.out.println("Площадь: " + rect.getArea());
            System.out.println("Периметр: " + rect.getPerimeter());
        }
    }
}
