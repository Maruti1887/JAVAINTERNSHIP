class Simple
{
	void triangle(){
		int b=20;
		int h=20;
		double val=0.5;
		double res=b*h*val;
		System.out.println("The area of the Triangle is "+res);
	}
	void trapezoid(){
		int b=7;
		int a=8;
		int h=9;
		double val=0.5;
		double res=val*(a+b)*h;
		System.out.println("The area of the Trapezoid is "+res);
	}
	void ellipse(){
		int a=10;
		int b=20;
		double pi=3.142;
		double res=a*b*pi;
		System.out.println("The area of the Ellipse is "+res);
	}
	void sector(){
		int r=10;
		double val=0.5;
		double theta=3.4;
		double res=val*r*r*theta;
		System.out.println("The area of the Sector is "+res);
	}
	void square(){
		int a=10;
		int res=a*a;
		System.out.println(" The area of the square is "+res);
	}
	void rectangle(){
		int a=10;
		int b=20;
		int res=a*b;
		System.out.println(" The area of the rectangle is "+res);
	}
	void parelelogram(){
		int b=10;
		int h=20;
		int res=b*h;
		System.out.println(" The area of the parrelogram "+res);
	}
	void circle(){
		double pi=3.142;
		int r=7;
		
		double res=pi*r*r;
		System.out.println(" The area of the circle is " +res);
	}
	public static void main(String[] args) 
	{
		System.out.println("The program is based on the ref variable");
		System.out.println(" Simple programs without using the return type and parameters");
		System.out.println(" --------------------------------------------");
		Simple C1= new Simple();
		C1.circle();
		C1.triangle();
		C1.trapezoid();
		C1.ellipse();
		C1.sector();
		C1.square();
		C1.rectangle();
		C1.parelelogram();
		
	}
}
