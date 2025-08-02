package lab1;

import java.util.Scanner;

public class volume_of_sphere {
	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
     System.out.println("enter the volume");
     int r=sc.nextInt();
     float pi=3.14f;
     double volume=(4.0/3.0)*pi*r*r*r;
     System.out.println("volume is:"+volume);
}
}
