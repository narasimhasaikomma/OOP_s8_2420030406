package lab3;
import java.util.*;
public class non_repeating_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter a string: ");
		        String input = sc.nextLine();

		        for (int i = 0; i < input.length(); i++) {
		            char c = input.charAt(i);
		            if (input.indexOf(c) == input.lastIndexOf(c)) {
		                System.out.println( c);
		                return; 
		            }
		        }
		    }
	}


