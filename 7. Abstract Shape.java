abstract class Shape {
    abstract double calculate_area();

    void display_info() {
        System.out.println("Shape Info");
    }
}

class Circle extends Shape {
    double r;

    Circle(double r) {
        this.r = r;
    }

    double calculate_area() {
        return 3.14 * r * r;
    }
}

class Rect extends Shape {
    double l, b;

    Rect(double l, double b) {
        this.l = l;
        this.b = b;
    }

    double calculate_area() {
        return l * b;
    }

    public static void main(String[] args) {
        Shape s1 = new Circle(3);
        Shape s2 = new Rect(4, 5);

        s1.display_info();
        System.out.println(s1.calculate_area());

        s2.display_info();
        System.out.println(s2.calculate_area());
    }
}
