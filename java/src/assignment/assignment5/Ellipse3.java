class Ellipse3
{
	public static void main(String[] args) 
	{
		double result = Shape.area();
		System.out.println(" the area of the ellipse is "+result);
		
	}
}
class Shape
{
	public static double area (){
		double pi = 0.5;
		
		int a=10;
		int b=20;
		double res=pi*a*b;
		return res;
		
		
		
		
	}
}
