package kh;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap vao 1 so nguyen bat ky: ");
        int songuyen = in.nextInt();

        if (songuyen > 0)
        {
            System.out.println("So "+songuyen+" la so duong");
        }
        else if (songuyen < 0)
        {
            System.out.println("So "+songuyen+" la so am");
        }
        else
        {
            System.out.println("So ban vua nhap la so 0");
        }
    }
}