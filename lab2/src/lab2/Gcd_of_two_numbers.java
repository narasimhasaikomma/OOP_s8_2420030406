package lab2;
import java.util.*;
public class Gcd_of_two_numbers {

		 public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter first number: ");
		        int a = sc.nextInt();

		        System.out.print("Enter second number: ");
		        int b = sc.nextInt();

		        // Euclidean algorithm
		        while (b != 0) {
		            int temp = b;
		            b = a % b;
		            a = temp;
		        }

		        System.out.println("GCD is: " + a);
		 }
	
	}


