package kh;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] Strings) {
double inch,met;
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap vao so inch ");
        inch = input.nextDouble();
        met =(inch*0.0254);
        System.out.println(inch + " inch bang " + met + " met");
    }
}
