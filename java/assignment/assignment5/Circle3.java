class Circle3
{
	public static void main(String[] args) 
	{
		double res =Shape.area(3);
		System.out.println(" the area of the Circle is "+res);
		
	}
}
class Shape
{
	public static double area(int r){
		double pi = 3.142;
		double res=pi*r*r;
		return res;
		
		
	}
}
