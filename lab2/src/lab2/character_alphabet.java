package lab2;
import java.util.*;
public class character_alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a character: ");
	        char ch = scanner.next().charAt(0); 

	        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
	            System.out.println(ch + " is an alphabet");
	        } else {
	            System.out.println(ch + " is NOT an alphabet");
	        }

	}
}