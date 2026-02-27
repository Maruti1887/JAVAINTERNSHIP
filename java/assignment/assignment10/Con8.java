class Con8
{	
	
	String h_name;
	String h_color;
	int h_cost;
	Con8(String h_name,String h_color,int h_cost){
		
		this.h_name=h_name;
		this.h_color=h_color;
		this.h_cost=h_cost;
	}
	
	public static void main(String[] args) 
	{
		Con8 c=new Con8("BIRLa","White",10000);
		System.out.println(c.h_name);
		System.out.println(c.h_color);
		System.out.println(c.h_cost);
		
	}
}
