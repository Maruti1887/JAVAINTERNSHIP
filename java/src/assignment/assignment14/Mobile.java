package assignment.assignment14;
class Mobile1
{
	void mob(){
		System.out.println("It contains only camera");
		
	}
}
class Mobile2 extends Mobile1 
{
	void mob(){
	System.out.println("It contains with flash and camera");
	
	
	}
}
class Mobile{
	public static void main(String[] args) 
	{
		Mobile2 m1=new Mobile2();
		m1.mob();
	}
}
