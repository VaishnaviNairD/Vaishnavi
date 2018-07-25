class Vowel 
{
public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s =new Scanner(System.in);
System.out.println("enter the alphaabet");
char ch=s.next().charAt(0);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
{
	System.out.println("the character is a vowel");
}
else
{
	System.out.println("the character is a consonant");
}
	}

}
