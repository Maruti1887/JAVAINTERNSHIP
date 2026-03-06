class Demo1
{
	void add(){
	System.out.println("HELOO ");
	}
}
class Demo2 extends Demo1
{
	void tata(){
		
	System.out.println("The Queen and king");
	}
	int b=20;
}
class Main11
{
	public static void main(String[] args) 
	{
		Demo1 d1 = new Demo2();
		d1.add();
		Demo2 d2=(Demo2)d1;
		d2.tata();
		d2.add();
		System.out.println(d2.b);
		
		
	}
}
