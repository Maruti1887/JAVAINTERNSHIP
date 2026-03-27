package assignment.assignment14;
class Jspiders
{
	void mob(){
		System.out.println("It has testing course");
		
	}
}
class Jspiders1 extends Jspiders 
{
	void mob(){
	System.out.println("It has testing course and development course");
	
	
	}
}
class Jspider{
	public static void main(String[] args) 
	{
		Jspiders1 n1=new Jspiders1();
		n1.mob();
		
	}
}
