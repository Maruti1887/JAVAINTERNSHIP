class Demo1{
	int x=10;
}
class Demo11 extends Demo1{
	
	void demo2(){
		System.out.println("The single level inheritance");
		System.out.println(x);
	}
}
class  Single
{
	public static void main(String[] args) 
	{
		Demo11 d1=new Demo11();
		System.out.println(d1.x);
		d1.demo2();
	}
}
