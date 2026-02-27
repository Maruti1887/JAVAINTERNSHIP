class Con9
{	
	
	String c_size;
	String c_color;
	int c_cost;
	Con9(String c_color,String c_size,int c_cost){
		
		this.c_color=c_color;
		this.c_size=c_size;
		this.c_cost=c_cost;
	}
	
	public static void main(String[] args) 
	{
		Con9 c=new Con9("XL","White",10000);
		System.out.println(c.c_size);
		System.out.println(c.c_color);
		System.out.println(c.c_cost);
		
	}
}
