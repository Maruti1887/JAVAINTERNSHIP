class Con8
{	
	
	String h_name;
	String h_color;
	int h_cost;
	Con8(String a,String b,int c){
		
		h_name=a;
		h_color=b;
		h_cost=c;
	}
	
	public static void main(String[] args) 
	{
		Con8 c=new Con8("BIRLa","White",10000);
		System.out.println(c.h_name);
		System.out.println(c.h_color);
		System.out.println(c.h_cost);
		
	}
}
