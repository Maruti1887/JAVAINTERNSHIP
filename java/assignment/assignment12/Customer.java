class MeghanaBiriyani
{	void food(){
	System.out.println(" FULL MEALS BIRIYANI");
}
}
class DeliveryBoy
{
	static void getfodd(MeghanaBiriyani m3){
		m3.food();
	}
}
class Swiggy
{
	static void order(MeghanaBiriyani m2){
		
		DeliveryBoy.getfodd(m2);
	}
}

class Customer
{
	public static void main(String[] args) 
	{
		MeghanaBiriyani m1=new MeghanaBiriyani();
		Swiggy.order(m1);
			}
}
