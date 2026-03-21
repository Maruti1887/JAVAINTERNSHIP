class Demo1
{
	void add(){
	System.out.println("The king is always king i also know that thing but some time you have to know th fact that ");
	int b=20;
	System.out.println(b);
	}
}
class Demo2 extends Demo1
{
	void tata(){
		System.out.println("HELOO everone:");
	}
}
class Main8
{
	public static void main(String[] args) 
	{
		Demo1 d1 = new Demo2();
		d1.add();
		Demo2 d2=(Demo2)d1;
		d2.tata();
		d2.add();
		
		
	}
}
