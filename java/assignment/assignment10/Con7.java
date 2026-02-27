class Con7
{	
	
	String l_name;
	String l_brand;
	int l_cost;
	Con7(String l_name,String l_brand,int l_cost){
		
		this.l_name=l_name;
		this.l_brand=l_brand;
		this.l_cost=l_cost;
	}
	
	public static void main(String[] args) 
	{
		Con7 c=new Con7("THINKPAD","LENOBO",10000);
		System.out.println(c.l_name);
		System.out.println(c.l_brand);
		System.out.println(c.l_cost);
		
	}
}
