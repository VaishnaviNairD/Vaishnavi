import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int n;
Scanner s=new Scanner(System.in);
System.out.println("Enter the inputs");
int a=s.nextInt();
int b=s.nextInt();
int c[]= {1,2,3,4,5};
for(int i=1;i<=b;i++)
{
	sum+=i;
}
System.out.println(sum);
	}
}
