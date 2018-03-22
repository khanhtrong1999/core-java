package kh;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] Strings) {
    	double f,c;

        Scanner input = new Scanner(System.in);

        System.out.print("Nhap vao do F ");
        f = input.nextDouble();

        c =((f-32) / 1.8);
        System.out.println(f + " do F bang " + c + " do C");
    }}