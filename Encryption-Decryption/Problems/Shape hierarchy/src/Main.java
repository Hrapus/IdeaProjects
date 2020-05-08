abstract class Shape {

    abstract double getPerimeter();

    abstract double getArea();
}

class Triangle extends Shape{

    double one;
    double two;
    double three;

    public Triangle(double one, double two, double three) {
        this.one = one;
        this.two = two;
        this.three = three;
    }

    @Override
    double getPerimeter() {
        return one + two + three;
    }

    @Override
    double getArea() {
        double p = (one + two + three) / 2;
        return Math.sqrt((p * (p - one) * (p - two) * (p - three)));
    }
}

class Rectangle extends Shape {

    double one;
    double two;

    public Rectangle(double one, double two) {
        this.one = one;
        this.two = two;
    }

    @Override
    double getPerimeter() {
        return (one + two) * 2;
    }

    @Override
    double getArea() {
        return one * two;
    }
}

class Circle extends Shape{

    double one;

    public Circle(double one) {
        this.one = one;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * one;
    }

    @Override
    double getArea() {
        return Math.PI * one * one;
    }
}

class Test{
    public static void main(String[] args) {
        System.out.println(new Rectangle(5, 10).getPerimeter());
        System.out.println(new Rectangle(5, 10).getArea());

        System.out.println(new Triangle(3,4,5).getArea());
        System.out.println(new Triangle(3,4,5).getPerimeter());
    }
}