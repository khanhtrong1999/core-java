package kh;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  System.out.print("nhap so thu nhat: ");
  int so1 = in.nextInt();
  System.out.print("nhap so thu hai: ");
  int so2 = in.nextInt();
  System.out.print("nhap so thu ba: ");
  int so3 = in.nextInt();
  int max=0;  
  if (so1 > so2)
   if (so1 > so3)
        max = so1;
   
  if (so2 > so1)
   if (so2 > so3)
        max = so2;
   
  if (so3 > so1)
   if (so3 > so2)
       max = so3;
  
System.out.println("So lon nhat la" + max);
 }
}