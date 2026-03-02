class Sample1
{
	int x=20;
}
class Sample2 extends Sample1
{
	void test1(){
	System.out.println("This is the class1");
	}
}
class Sample3 extends Sample1
{
	void test2(){
	System.out.println("THis is the class2");
	}
}


class Hiera 
{
	public static void main(String[] args) 
	{
		Sample2 s1=new Sample2();
		s1.test1();
		System.out.println(s1.x);
		
		
		
		Sample3 s2=new Sample3();
		s2.test2();
		System.out.println(s2.x);
		
	}
}
