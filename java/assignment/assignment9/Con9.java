class Con9
{	
	
	String c_size;
	String c_color;
	int c_cost;
	Con9(String a,String b,int c){
		
		c_color=a;
		c_size=b;
		c_cost=c;
	}
	
	public static void main(String[] args) 
	{
		Con9 c=new Con9("XL","White",10000);
		System.out.println(c.c_size);
		System.out.println(c.c_color);
		System.out.println(c.c_cost);
		
	}
}
