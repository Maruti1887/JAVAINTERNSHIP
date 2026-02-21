class Palindrome
{
	
	public static void main(String[] args) 
	{
		int year=2500;
		if(num%4==0 && num%100!=0 || num%400==0){
			if(num%100==0)
				System.out.println("the year is leap year with century");
			else
				System.out.println(" The year is leap year but not century");
			
		}
		else
			System.out.println("The year is not leap year");
	}
}
