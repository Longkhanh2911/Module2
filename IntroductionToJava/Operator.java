package IntroductionToJava;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        float Height;
        float Width;

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập Height ");
        Height = scanner.nextFloat();

        System.out.println("nhập Width ");
        Width = scanner.nextFloat();

        float rectangularArea = Height * Width; // rectangular Area: hình chữ nhật
        System.out.println(rectangularArea);
    }
}
