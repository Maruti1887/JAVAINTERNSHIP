class Triangle1
{
	public static void main(String[] args) 
	{
		Shape.area();
	}
}
class Shape
{
	public static void area(){
		double val=0.5;
		int b=7;
		int h=8;
		double res=val*b*h;
		System.out.println(" the area of the Triangle is "+res);
	}
}