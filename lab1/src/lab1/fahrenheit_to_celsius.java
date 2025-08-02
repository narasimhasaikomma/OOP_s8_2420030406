package lab1;

import java.util.Scanner;

public class fahrenheit_to_celsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the temperature");
		 double celsius=sc.nextInt();
		 double fahrenheit=(celsius*(9.0/5.0)+32);
		 System.out.println("the temperature is:"+fahrenheit);
			
	}

}
