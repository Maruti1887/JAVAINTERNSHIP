class Circle 
{
	public static double area(){
		double pi=3.142;
		int r=7;
		double res=pi*r*r;
		return res;
	}
	public static void main(String[] args) 
	{
		System.out.println("The area of the Circle is :");
		double res=area();
		System.out.println(res);
	}
}
