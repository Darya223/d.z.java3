package org.itstep.qa.lesson;
import java.util.Scanner;
public class ZadachaThree {
    public static void main(String[]args) {
        Scanner inn = new Scanner(System.in);
        int a;
        int b;
        int c;
        a = inn.nextInt();
        b = inn.nextInt();
        c = inn.nextInt();
        if (a == b & b == c)
            System.out.println("треугольник равносторонний");
        else if (a == b & b != c)
            System.out.println("треугольник равнобедренный");
        else if (a == c & c != b)
            System.out.println("треугольник равнобедренный");
        else if (b == c & c != a)
            System.out.println("треугольник равнобедренный");
        else
            System.out.println("треугольник разносторонний");
    }
}
