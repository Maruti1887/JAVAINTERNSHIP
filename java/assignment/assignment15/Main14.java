class Demo1
{
	
	void add(){
	System.out.println("The Queen");
	
	}
	int b=20;
}
class Demo2 extends Demo1
{
	int d=20;
}
class Main14
{
	public static void main(String[] args) 
	{
		Demo1 d1 = new Demo2();
		d1.add();
		System.out.println(d1.b);
		Demo2 d2=(Demo2)d1;
		d2.add();
		System.out.println(d2.b);
		System.out.println(d2.d);
		
		
	}
}
