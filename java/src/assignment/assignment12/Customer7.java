class Burg
{
	void food(){
		System.out.println("Take this burger");
		
	}
}
class Deliveryguy
{
	static void food2(Burg b3){
		b3.food();
	}
}
class Burgapk
{
	static void food3(Burg b2){
	Deliveryguy.food2(b2);
}

}

class Customer7
{
	public static void main(String[] args) 
	{
		Burg c1=new Burg();
		Burgapk.food3(c1);
	}
}
