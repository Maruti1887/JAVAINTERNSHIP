package assignment.assignment14;
class Rapoido1
{
	void arm(){
		System.out.println("It has bike ride");
		
	}
}
class Navy extends Rapoido1 
{
	void arm(){
	System.out.println(" It has car and bike");
	
	
	}
}
class Army{
	public static void main(String[] args) 
	{
		Navy n1=new Navy();
		n1.arm();
	}
}
