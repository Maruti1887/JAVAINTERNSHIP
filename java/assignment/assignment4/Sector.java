class Sector
{
	public static double area(){
		double r=13;
		int theta=180;
		final double val=0.5;
		final double pi=3.142;
		double res= (theta/360.0)*pi*r*r;
		return res;
	}
	public static void main(String[] args) 
	{
		System.out.println("The area of the Sector is :");
		double res=area();
		System.out.println(res);
	}
}
