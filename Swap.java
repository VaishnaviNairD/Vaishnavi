import java.util.Scanner;
public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String sw=s.nextLine();
		char ch[]=sw.toCharArray();
		for(int i=1;i<sw.length();i++)
		{
			char temp=ch[0];
			ch[0]=ch[1];
			ch[1]=temp;
			char temp1=ch[2];
			ch[2]=ch[3];
			ch[3]=temp1;
			}
		String b=new String(ch);
System.out.println(b);
	}
}
