class Trapezoid 
{
	void  area(){
		double val=0.5;
		int a=23;
		int b=20;
		int h=20;
		double res=val*(a+b)*h;
		System.out.println(" the area of the Trapezoid is"+res);
	}
	public static void main(String[] args) 
	{
		new Trapezoid().area();
	}
}
