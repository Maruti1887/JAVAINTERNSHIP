class Demo1
{
	void disp(){
		System.out.println("HELOO");
	}
}
class Demo2 extends Demo1
{
	void tata(){
		System.out.println("HELOO everone:");
	}
}




class Main2
{
	public static void main(String[] args) 
	{
		Demo1 d1 = new Demo2();
		d1.disp();
		Demo2 d2=(Demo2)d1;
		
		d2.tata();
		
		
	}
}
