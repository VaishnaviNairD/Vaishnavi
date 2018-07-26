import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s =new Scanner(System.in);
System.out.println("Enter the times we want to print hello");
int n=s.nextInt();
for(int i=0;i<n;i++)
{
	System.out.println("Hello");
}

	}

}
