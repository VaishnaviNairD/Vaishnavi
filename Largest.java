import java.util.Scanner;
public class Largest {
public static void main(String[] args)
{
Scanner s =new Scanner(System.in);
System.out.println("Enter the three elements");
int x=s.nextInt();
int y=s.nextInt();
int z=s.nextInt();
if(x>y && x>z)
{
	System.out.println(x);
}
if(y>x && y>z)
{
	System.out.println(y);
}
if(z>x && z>y)
{
	System.out.println(z);
}
}
}
