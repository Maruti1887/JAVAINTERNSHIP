class Sector
{
	double area(){
		double val=3.142;
		int r=10;
		double theta=3.2;
		double res=val*r*r*theta;
		return res;
	}
}


class Mainsector 
{
	static String ename ="Maruti";
	static int id=10;
	public static void main(String[] args) 
	{
		Sector s1=new Sector();
		double m1=s1.area();
		System.out.println(" The area of the sector is "+m1);
		System.out.println(" the name of the emaployee is "+ename +" and the id is "+id);
	}
}
