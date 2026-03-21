class Lman
{
	void Laptop(){
		System.out.println("Laptop");
		
	}
}
class Distri
{
	static void Laptop1(Lman m3){
		m3.Laptop();
	}
}
class Laptopshop
{
	static void Laptop2(Lman m2){
	Distri.Laptop1(m2);
}

}

class Customer8
{
	public static void main(String[] args) 
	{
		Lman c1=new Lman();
		Laptopshop.Laptop2(c1);
	}
}
