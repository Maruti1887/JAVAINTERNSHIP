import java.util.Scanner;
class Demo21
{
	String disp(String str)
	{
		String rev="";
		for(int i=str.length()-1;i>=0;i--){
			rev=rev+str.charAt(i);
			
		}
		return rev;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter the stirng");
		String abc=sc.nextLine();
		Demo21 m1= new Demo21();
		
		String v=m1.disp(abc);
		System.out.println("The reverse of the string is "+v);
	}
}
