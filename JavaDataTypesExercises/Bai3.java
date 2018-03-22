package kh;

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);
        int num,firstDigit,remainingNumber,SecondDigit,thirdDigit,sum;
        System.out.print("Nhap so nguyen tu 0 den 1000: ");
        num = input.nextInt();
        firstDigit = num % 10;
        remainingNumber = num / 10;
        SecondDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        thirdDigit = remainingNumber % 10;
        sum = thirdDigit + SecondDigit + firstDigit;

        System.out.println("Tong cac chu so cua " + num + " la " + sum);

    }
}