class Parameter
{
	void triangle(int b,int h){
		//int b=20;
		//int h=20;
		double val=0.5;
		double res=b*h*val;
		System.out.println("The area of the Triangle is "+res);
	}
	void trapezoid(int b,int a,int h){
		//int b=7;
		//int a=8;
		//int h=9;
		double val=0.5;
		double res=val*(a+b)*h;
		System.out.println("The area of the Trapezoid is "+res);
	}
	void ellipse(int a,int b){
		//int a=10;
		//int b=20;
		double pi=3.142;
		double res=a*b*pi;
		System.out.println("The area of the Ellipse is "+res);
	}
	void sector(int r){
		//int r=10;
		double val=0.5;
		double theta=3.4;
		double res=val*r*r*theta;
		System.out.println("The area of the Sector is "+res);
	}
	void square(int a){
		//int a=10;
		int res=a*a;
		System.out.println(" The area of the square is "+res);
	}
	void rectangle(int a, int b){
		//int a=10;
		//int b=20;
		int res=a*b;
		System.out.println(" The area of the rectangle is "+res);
	}
	void parelelogram(int b, int h){
		//int b=10;
		//int h=20;
		int res=b*h;
		System.out.println(" The area of the parrelogram "+res);
	}
	void circle(int r){
		double pi=3.142;
		//int r=7;
		
		double res=pi*r*r;
		System.out.println(" The area of the circle is " +res);
	}
	public static void main(String[] args) 
	{
		System.out.println("The program is based on the ref variable");
		System.out.println(" Simple programs using  parameters");
		System.out.println(" --------------------------------------------");
		Parameter C1= new Parameter();
		C1.circle(7);
		C1.triangle(8,9);
		C1.trapezoid(9,10,11);
		C1.ellipse(20,32);
		C1.sector(6);
		C1.square(9);
		C1.rectangle(8,9);
		C1.parelelogram(8,9);
		
	}
}
