class Sample1
{
	int x=10;
}
class Sample2 extends Sample1
{
	int y=20;
}
class Sample3 extends Sample2
{
	void test(){
		System.out.println(" this is the multilevel inheritance");
		
	}
		
}
class Multilevel
{
	public static void main(String[] args) 
	{

	Sample3 s=new Sample3();
	s.test();
	System.out.println(s.x);
	System.out.println(s.y);

	}
}
