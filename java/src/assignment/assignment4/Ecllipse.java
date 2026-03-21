class Ecllipse
{
	public static double area( ){
		int a=20;
		int b=20;
		final double pi = 3.142;
		double res=pi*a*b;
		return res;
	}
	public static void main(String[] args) 
	{
		System.out.println("The area of the Ecllipse is :");
		double res=area();
		System.out.println(res);
	}
}
