import java.util.Scanner;

public class ReverseNumber {

	    public static void main(String[] args) {
	    	Scanner s=new Scanner(System.in);
	    	System.out.println("Input");
	    	int num=s.nextInt();
	    	int reversed = 0;

	        while(num != 0) {
	            int digit = num % 10;
	            reversed = reversed * 10 + digit;
	            num /= 10;
	        }

	        System.out.println(reversed);
	    }
	}
