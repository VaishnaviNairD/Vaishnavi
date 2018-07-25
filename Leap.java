import java.util.Scanner;
public class Leap {
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the year");
	int n=s.nextInt();
	if(n%4==0)
		{
		System.out.println("yes");
	}
	else
	{
		System.out.println("no");
	}
}
}
