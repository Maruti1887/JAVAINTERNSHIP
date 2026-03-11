import java.util.Scanner;

class Uppercase 
{
	public static String upper(String stri){
		
		char last=(char)(stri.charAt(stri.length()-1)-32);
		char first=(char)(stri.charAt(0)-32);
		String rem=stri.substring(1,stri.length()-1);
		
		String val =first+rem+last;
		return val;
	}
	
	
	public static void main(String[] args) 
	{
		/* Scanner sc=new Scanner(System.in);
		System.out.println(" enter the lowercase word");
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++){
			if(i==0){
				System.out.print((char)(str.charAt(i)-32));
			}
			if(i!=0){
				System.out.print(str.charAt(i));
			}
		}
		*/
		
		
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println(" enter the lowercase word");
		String str=sc.nextLine();
		char first=(char)(str.charAt(0)-32);
		String rem=str.substring(1,str.length()-1);
		char last=(char)(str.charAt(str.length()-1)-32);
		System.out.println(""+first+rem+last);
		
		
		System.out.println(""+last+rem+first);
		*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter the lowercase sentence");
		String str=sc.nextLine();
		String [] s=str.split(" ");
		String New="";
		for(int i=0;i<s.length;i++)
		{
			New =New+" "+upper(s[i]);
		}
		System.out.println(New);
	}
}
