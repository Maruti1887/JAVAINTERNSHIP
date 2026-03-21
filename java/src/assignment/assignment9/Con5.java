class Con5 
{	
	int bike_cost;
	String bike_color;
	String bike_brand;
	Con5(int a,String b,String c){
		bike_cost=a;
		bike_color=b;
		bike_brand=c;
	
	}
	
	public static void main(String[] args) 
	{
		Con5 c=new Con5(2000, "Blue","TVS");
		System.out.println(" The cost of the bike is "+c.bike_cost);
		System.out.println(" The color of the bike is"+c.bike_color);
		System.out.println(" The brand of the bike is"+c.bike_brand);
		
	}
}
