class Shape {
    void display() {
        System.out.println("Shape");
    }
}

class Circle extends Shape {
    void area(double r) {
        System.out.println(3.14 * r * r);
    }
}

class Rectangle extends Shape {
    void area(double l, double b) {
        System.out.println(l * b);
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.display();
        c.area(3);

        r.display();
        r.area(4, 5);
    }
}
