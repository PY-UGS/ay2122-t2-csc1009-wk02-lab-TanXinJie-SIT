import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args)
    {
        /*Circle circle1 = new Circle();
        System.out.println("The area of the circle (" + circle1.radius + "): " + circle1.getArea());

        Circle circle2 = new Circle(10);
        System.out.println("The area of the circle (" + circle2.radius + "): " + circle2.getArea());

        Circle circle3 = new Circle(50);
        System.out.println("The area of the circle (" + circle3.radius + "): " + circle3.getArea());

        circle3.setRadius(100);
        System.out.println("The area of the circle (" + circle3.radius + "): " + circle3.getArea());
        */

        Circle circleTest = new Circle();
        System.out.print("Enter a number for radius: ");
        Scanner input = new Scanner(System.in);
        float floatValue = input.nextFloat();
        circleTest.setRadius(floatValue);
        input.close();
        System.out.println("The area for the circle of radius " + floatValue + " is " + circleTest.getArea());
    }
}

class Circle {
    double radius;

    Circle(){
        radius =1;
    }
    Circle(double newRadius){
        radius = newRadius;
    }

    double getArea(){
        return radius * radius * 3.14159;
    }

    double getPerimeter(){
        return 2 * radius * 3.14159;
    }

    void setRadius(double newRadius){
        radius = newRadius;
    }
}
