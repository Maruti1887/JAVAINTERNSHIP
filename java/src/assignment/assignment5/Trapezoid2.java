class Trapezoid2
{
	public static void main(String[] args) 
	{
		Shape.area(20,30,40);
		
	}
}
class Shape
{
	public static void area(int a,int b, int h){
		double val = 0.5;
		
		double res=val*(a+b)*h;
		System.out.println(" the area of the Trapezoid is "+res);
		
		
	}
}
