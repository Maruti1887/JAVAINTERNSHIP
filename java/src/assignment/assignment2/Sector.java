package assignment.assignment2;
class Sector{
	public static void area(){
		final double val=0.5;
		double degre= 180;
		int t=360;
		int r=7;
		double res= val * (degre /t) *r*r;
		System.out.println(res);
	}
	public static void main(String[] args) 
	{
		area();
	}
}
