package exercise2;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a radius: ");
        double radius = input.nextDouble();
        double c = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Circumference: " + c);
        System.out.println("Area: " + area);
    }

}
