import java.util.Scanner;

public class Add {
	 public static void main(String[] args) {

	        int Output = 0;
Scanner s=new Scanner(System.in);
System.out.println("Input");
int num=s.nextInt();
	        while(num != 0)
	        {
	            num /= 10;
	            Output++;
	        }
	        System.out.println(Output);
	    }
}
