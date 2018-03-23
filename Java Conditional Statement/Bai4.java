package kh;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args)
   {
       Scanner in = new Scanner(System.in);
       System.out.print("Nhap gia tri: ");
       double input = in.nextDouble();

       if (input > 0)
       {
           if (input < 1)
           {
               System.out.println("So am nho nhat");
           }
           else if (input > 1000000)
           {
               System.out.println("So am lon nhat");
           }
           else
           {
               System.out.println("So duong");
           }
       }
       else if (input < 0)
       {
           if (Math.abs(input) < 1)
           {
               System.out.println("So am nho nhat");
           }
           else if (Math.abs(input) > 1000000)
           {
               System.out.println("So am lon nhat");
           }
           else
           {
               System.out.println("So duong");
           }
       }
       else
       {
           System.out.println("Khong");
       }
       
   }
}