class Con4

{	int t_cost;
	String t_model;
	String t_type;
	Con4(int a,String b,String c){
		t_cost=a;
		t_model=b;
		t_type=c;
	}
	public static void main(String[] args) 
	{
		Con4 c=new Con4( 1000, "LG","LCD");
		System.out.println(" The TV cost is " +c.t_cost);
		System.out.println(" THE tv model is " +c.t_type);
		System.out.println(" THe tv type is " +c.t_type);
	}
}