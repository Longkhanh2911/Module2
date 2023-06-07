package IntroductionToJava;

import java.util.Scanner;

public class firstDegreeEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập a: ");
        double a = scanner.nextDouble();

        System.out.println("nhập b: ");
        double b = scanner.nextDouble();

        System.out.println("nhập c: ");
        double c = scanner.nextDouble();

        if (a != 0) {
            double answer = (c - b) / a;
            System.out.println(answer);
        } else {
            if (b == c) {
                System.out.println("The solution is all x!");
            } else {
                System.out.println("No solution!");
            }
        }
    }
}
