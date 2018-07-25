class Four
{
public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the alphabet");
char ch=s.next().charAt(0);
if(ch>'a' && ch<'z' ||ch>'A' && ch<'Z')
{
	System.out.println("Alphabet");
}
else
{
	System.out.println("No");
}
	}

}
