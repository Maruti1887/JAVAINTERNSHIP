class Sample5
{
	int x=10;
}
class Demo5 extends Sample5
{
	int y=20;
}
class Cool5 extends Sample5
{
	int z=30;
}
class Tester5 extends Demo5
{
	void disp(){
		System.out.println(" This is the last block ");
	}
}



class Hybrid 
{
	public static void main(String[] args) 
	{
		Tester5 t1 = new Tester5();
		t1.disp();
		System.out.println(t1.x);
		System.out.println(t1.y);
		
		
		Cool5 c1=new Cool5();
		System.out.println(c1.z);
		
	}
}
