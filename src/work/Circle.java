package work;

public class Circle {
	double area(double r) {
		final double pi=3.142;
		double res=r*r*pi;
		System.out.println("the area of the circle is "+res);
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		double r=20;
//		final double pi=3.142;
//		double res=r*r*pi;
//		System.out.println("the area of the circle is "+res);
		Circle a1=new Circle();
		double m1=a1.area(20);
		
		
	}

}
