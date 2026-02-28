import java.util.Scanner;
class String3
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter the big string");
		String s=sc.nextLine();
		System.out.println(s);
		System.out.println(" enter the string you dont want in the original stirng");
		String str=sc.next();
		System.out.println(" enter the string you dont want in replace in the original stirng");
		String str1=sc.next();
		
		System.out.println(s.replace(str,str1));
		
	}
}
