class Trapezoid 
{
	public static double area(){
		int a=20;
		int b=40;
		int h=10;
		final double val=0.5;
		double res=val*(a+b)*h;
		return res;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("The area of the Trapezoid is :");
		double res=area();
		System.out.println(res);
	}
}
