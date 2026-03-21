class Return1
{
	double triangle(){
		int b=20;
		int h=20;
		double val=0.5;
		double res=b*h*val;
		return res;
		
	}
	double trapezoid(){
		int b=7;
		int a=8;
		int h=9;
		double val=0.5;
		double res=val*(a+b)*h;
		return res;
		
	}
	double ellipse(){
		int a=10;
		int b=20;
		double pi=3.142;
		double res=a*b*pi;
		return res;
		
	}
	double sector(){
		int r=10;
		double val=0.5;
		double theta=3.4;
		double res=val*r*r*theta;
		return res;
		
	}
	int square(){
		int a=10;
		int res=a*a;
		return res;
	}
	int rectangle(){
		int a=10;
		int b=20;
		int res=a*b;
		return res;
		
	}
	int  parelelogram(){
		int b=10;
		int h=20;
		int res=b*h;
		return res;
		
	}
	double circle(){
		double pi=3.142;
		int r=7;
		
		double res=pi*r*r;
		return res;
		
	}
	public static void main(String[] args) 
	{
		System.out.println("The program is based on the ref variable");
		System.out.println(" Simple programs with using the return type ");
		System.out.println(" --------------------------------------------");
		Return1 C1= new Return1();
		double res1=C1.circle();
		System.out.println("The area of the circle is "+res1);
		double res2=C1.triangle();
		System.out.println("The area of the Triangle is "+res2);
		double res3=C1.trapezoid();
		System.out.println("The area of the Trapezoid is "+res3);
		double res4=C1.ellipse();
		System.out.println("The area of the ellipse is "+res4);
		double res5=C1.sector();
		System.out.println("The area of the sector is "+res5);
		int res6=C1.square();
		System.out.println("The area of the square is "+res6);
		int res7=C1.rectangle();
		System.out.println("The area of the rectangle is "+res6);
		int res8=C1.parelelogram();
		System.out.println("The area of the parelelogram is "+res7);
		
	}
}
