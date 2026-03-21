class Pizzhut
{
	void food(){
		System.out.println("Pizza");
		
	}
}
class Deliverfood

{
	static void delivery(Pizzhut p3){
		p3.food();
	}
}
class Zomato
{
	static void zom(Pizzhut p2){
	Deliverfood.delivery(p2);
}

}

class Customer4
{
	public static void main(String[] args) 
	{
		Pizzhut p1=new Pizzhut();
		Zomato.zom(p1);
	}
}
