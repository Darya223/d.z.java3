package org.itstep.qa.lesson;
import java.util.Scanner;
public class ZadachaOne {
    public static void main(String[]args) {
      Scanner inn = new Scanner(System.in);
      int a;
      int b;
      a = inn.nextInt();
      b = inn.nextInt();
      if (a > b)
          System.out.println(a + "большее число");
      else
          if (b > a)
          System.out.println(b + "большее число");
          else
              System.out.println("числа равны");
    }
}
