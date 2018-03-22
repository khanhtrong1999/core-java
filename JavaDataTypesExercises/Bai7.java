package kh;

import java.util.Scanner;

public class Bai7 {
	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in); 
	            System.out.print("Nhap khoang cach voi don vi met: ");
	            float khoangcach = scanner.nextFloat();
	            System.out.print("Nhap so gio ");
	            float gio = scanner.nextFloat();
	            System.out.print("Nhap so phut ");
	            float phut = scanner.nextFloat();
	            System.out.print("Nhap so giay ");
	            float giay = scanner.nextFloat();
			float mps = khoangcach/ ((gio*3600) + (phut*60) +giay);
			float kph = ( khoangcach/1000.0f ) / ( ((gio*3600) + (phut*60) +giay)/3600.0f );
			float mph = kph / 1.609f;

			System.out.println("Toc do met tren giay la "+mps);
			System.out.println("Toc do met tren gio la "+kph);
			System.out.println("Toc do dam tren gio la "+mph);
		}
	}