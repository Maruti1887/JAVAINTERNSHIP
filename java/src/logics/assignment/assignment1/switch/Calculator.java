class Calculator 
{
	public static void main(String[] args) 
	{
		char expr='*';
		int a=10;
		int b=20;
		int c;
		switch(expr){
			case '+' : c=a+b;
				System.out.println(c);
				break;
			case '-' : c=a-b;
				System.out.println(c);
				break;
			case '*' : c=a*b;
				System.out.println(c);
				break;
			case '/' : c=a/b;
				System.out.println(c);
				break;
			case '%' : c=a%b;
				System.out.println(c);
				break;
			default:System.out.println(" Invalid Output ");
			
	}
}
}