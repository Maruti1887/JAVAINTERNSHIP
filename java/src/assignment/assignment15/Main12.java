class Demo1
{
	double z=20;
	int r=10;
}
class Demo2 extends Demo1
{
	int b=20;
}
class Main12
{
	public static void main(String[] args) 
	{
		Demo1 d1 = new Demo2();
		System.out.println(d1.z);
		System.out.println(d1.r);
		
		Demo2 d2=(Demo2)d1;
		System.out.println(d2.b);
		System.out.println(d2.z);
		System.out.println(d2.r);
		
		
		
	}
}
