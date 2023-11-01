package lamda;

import java.util.Arrays;
class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }


    public String toString() {
        return String.format("원의 반지름은", radius, "입니다");
    }


    public  int compareTo(Object o) {
        Circle c = (Circle)o;
        return (int) (getArea() - c.getArea());
    }
}

public class CircleDemoTest1 {
    public static void main(String[] args) {
        Circle[] circles = { new Circle(5.0), new Circle(2.5), new Circle(10.0)};

        Arrays.sort(circles);

        for(Circle c : circles)
            System.out.println(c);
    }
}
