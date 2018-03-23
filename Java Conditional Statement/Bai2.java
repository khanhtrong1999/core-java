package kh;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

            System.out.print("Nhap a: ");
            double a = input.nextDouble();
            System.out.print("Nhap b: ");
            double b = input.nextDouble();
            System.out.print("Nhap c: ");
            double c = input.nextDouble();

            double del = b * b - 4.0 * a * c;

            if (del > 0.0) {
                double x1 = (-b + Math.sqrt(del)) / (2.0 * a);
                double x2 = (-b - Math.sqrt(del)) / (2.0 * a);
                System.out.println("Ket qua la nghiem 1 " + x1 + " va nghiem 2 " + x2);
            } else if (del == 0.0) {
                double x1 = -b / (2.0 * a);
                System.out.println("Nghiem duy nhat la " + x1);
            } else {
                System.out.println("Vo nghiem");
            }
    }
}