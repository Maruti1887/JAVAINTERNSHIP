class Discount
{
	public static void main(String[] args) 
	{
		int a=1000;
		if(a>=5000)
			System.out.println("20 % discount");
		else if(a>=3000)
			System.out.println("15% Discount ");
		else if(a>=1000)
			System.out.println("10% discount ");
		else
			System.out.println(" No discount");
	}
}
