class Demo1
{
	int r=10;
}
class Demo2 extends Demo1
{
	void tata(){
		System.out.println("HELOO everone:");
	}
}
class Main3
{
	public static void main(String[] args) 
	{
		Demo1 d1 = new Demo2();
		System.out.println(d1.r);
		Demo2 d2=(Demo2)d1;
		d2.tata();
		
		
	}
}
