class Triangle

{
	public static double area(){
		final double val=0.5;
		int b=10;
		int h=10;
		double res=h*b*val;
		return res;
	}
	public static void main(String[] args) 
	{
		System.out.println("The area of the Triangle is :");
		double res=area();
		System.out.println(res);
	}
}
