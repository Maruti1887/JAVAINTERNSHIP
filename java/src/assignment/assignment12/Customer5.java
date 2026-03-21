class Busdepo
{
	void bus(){
		System.out.println("Buses");
		
	}
}
class Bustand
{
	static void stand1(Busdepo d3){
		d3.bus();
	}
}
class Village
{
	static void route(Busdepo d2){
	Bustand.stand1(d2);
}

}

class Customer5
{
	public static void main(String[] args) 
	{
		Busdepo d1=new Busdepo();
		Village.route(d1);
	}
}
