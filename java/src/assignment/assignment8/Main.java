class Main{
	public static void main(String[] args){
	System.out.println(" USing without paramaeter and return type ");
	System.out.println(" ----------------------------------------");
	Triangle T1=new Triangle();
	T1.area();
	Circle C1=new Circle();
	C1.area();
	Rectangle R1=new Rectangle();
	R1.area();
	Parr P1=new Parr();
	P1.area();
	Ellipse E1=new Ellipse();
	E1.area();
	Trapezoid Tr=new Trapezoid();
	Tr.area();
	Sector S1=new Sector();
	S1.area();
	Square S2 =new Square();
	S2.area();
	
	}
}
class Triangle{
	void area(){
	int h=10;
	int b=20;
	double res=b*h*0.5;
	System.out.println(" the area of the triagnle is " +res);
	}
}

class Circle{
	void area(){
	int r=10;
	double pi=3.142;
	double res=pi*r*r;
	System.out.println(" the area of the Circle is " +res);
	}
}
class Rectangle
{
	void area(){
		int a=10;
		int b=20;
		int res=a*b;
		System.out.println(" The area of the rectangle is"+res);
	}
}
class Parr
{
	void area(){
		int a=10;
		int b=20;
		int res=a*b;
		System.out.println(" The area of the Parrelelogram is"+res);
	}
}
class Ellipse{
	void area(){
	int b=10;
	int a=20;
	double pi=3.142;
	double res=pi*a*b;
	System.out.println(" the area of the Ellipse is " +res);
	}
}

class Sector{
	void area(){
	int r=10;
	double theta=3.2;
	double res=theta*r*r*0.5;
	System.out.println(" the area of the Sector is " +res);
	}
}
class Trapezoid
{
	void area(){
		int a=10;
		int b=20;
		int h=10;
		double res=0.5*(a+b)*h;
		System.out.println(" The area of the Trapezoid is"+res);
	}
}
class Square
{
	void area(){
		int a=10;
		int res=a*a;
		System.out.println(" The area of the Square is"+res);
	}
}

