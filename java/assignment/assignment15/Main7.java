class Demo1
{
	int x=20;
}
class Demo2 extends Demo1
{
	int y=80;
}
class Main7
{
	public static void main(String[] args) 
	{
		Demo1 d1 = new Demo2();
		System.out.println(d1.x);
		Demo2 d2=(Demo2)d1;
		System.out.println(d2.x);
		System.out.println(d2.y);
		
		
	}
}
