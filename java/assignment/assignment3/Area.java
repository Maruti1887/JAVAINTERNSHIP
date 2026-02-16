class Area
{
	public static void tri(double b, double h){
		final double val=0.5;
		double res= val*b*h;
		System.out.println(" the area of triangle is " + res);
	}
	public static void squre(double a){
		double res= a*a;
		System.out.println(" the area of Square is " + res);
		
	}
	public static void rectangle(double b, double h){
		double res=b*h;
		System.out.println(" The Area of Rectangle is " + res);
	}
	public static void parllelogram( double b,double h){
		double res=b*h;
		System.out.println(" the area of the parrlelogram " + res);	
	}
	public static void trapezoid(double a,double h,double b){
		final double val=0.5;
		double res=val*(a+b)*h;
		System.out.println(" the area of the trapezoid is " + res);
	}
	public static void Circle(double r){
		double pi=3.142;
		double res=pi*r*r;
		System.out.println(" the area of the circel is " + res);
	}
	public static void Sector(double r){
		int theta=180;
		final double val=0.5;
		final double pi=3.142;
		double res= (theta/360.0)*pi*r*r;
		System.out.println(" The area of the Sector is " + res);
	}
	public static void eclipse(double a,double b){
		final double pi = 3.142;
		double res=pi*a*b;
		System.out.println(" The area of the ecllipse is" + res);
	}
	public static void main(String[] args) 
	{
		tri(30,20);
		squre(30);
		rectangle(10,30);
		parllelogram( 20,40);
		trapezoid( 10,20,40);
		Circle(7);
		Sector( 8);
		eclipse(20,40);
		
	}
}
