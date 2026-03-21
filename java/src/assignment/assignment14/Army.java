class Army1
{
	void arm(){
		System.out.println(" the army it ha");
		
	}
}
class Navy extends Army 
{
	void arm(){
	System.out.println(" The army and navy it has");
	
	
	}
}
class Army{
	public static void main(String[] args) 
	{
		Navy n1=new Navy();
		n1.arm();
	}
}
