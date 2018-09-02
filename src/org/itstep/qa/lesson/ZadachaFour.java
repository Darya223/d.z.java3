package org.itstep.qa.lesson;
import java.util.Scanner;
public class ZadachaFour {
    public static void main(String[] args) {
        Scanner inn = new Scanner(System.in);
        int a;
        int b;
        int c;
        a = inn.nextInt();
        b = inn.nextInt();
        c = inn.nextInt();
        if (a > b & b > c)
            System.out.println("победитель оторвался от самого слабого игрока на" + (a - c) + "очков");
        else if (a > c & c > b)
            System.out.println("победитель оторвался от самого слабого игрока на" + (a - b) + "очков");
        else if (c > a & a > b)
            System.out.println("победитель оторвался от самого слабого игрока на" + (c - b) + "очков");
        else if (b > c & c > a)
            System.out.println("победитель оторвался от самого слабого игрока на" + (b - a) + "очков");
        else if (b > a & a > c)
            System.out.println("победитель оторвался от самого слабого игрока на" + (b - c) + "очков");
        else if (c > b & b > a)
            System.out.println("победитель оторвался от самого слабого игрока на" + (c - a) + "очков");
        else
            System.out.println("никто не победил");
    }
}
