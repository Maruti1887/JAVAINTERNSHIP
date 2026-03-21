class Trapezoid1
{
	public static void main(String[] args) 
	{
		Shape.area();
		
	}
}
class Shape
{
	public static void area(){
		double val = 0.5;
		int a=10;
		int b=20;
		int h=30;
		double res=val*(a+b)*h;
		System.out.println(" the area of the Trapezoid is "+res);
		
		
	}
}
