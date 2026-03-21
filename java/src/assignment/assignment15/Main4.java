class Demo1
{
	void add(){
	System.out.println("The king is always king");
	}
}
class Demo2 extends Demo1
{
	void tata(){
		System.out.println("HELOO everone:");
	}
}
class Main4
{
	public static void main(String[] args) 
	{
		Demo1 d1 = new Demo2();
		d1.add();
		Demo2 d2=(Demo2)d1;
		d2.tata();
		
		
	}
}
