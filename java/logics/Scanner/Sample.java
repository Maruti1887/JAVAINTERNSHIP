import java.util.Scanner;
class Sample 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=sc.nextLine();
		System.out.println("Enter the id");
		int id=sc.nextInt();
		System.out.println("Enter the section");
		char sec=sc.next().charAt(0);
		sc.nextLine();
		System.out.println("Enter the Address");
		String Address=sc.nextLine();
		
		System.out.println("Enter the Phoenno");
		long phone=sc.nextLong();
		System.out.println("The name is " + name +" the id is "+ id + " the section is " + sec + " The address is " + Address + " the phone no is " + phone );
		
		
		
		
	}
}
