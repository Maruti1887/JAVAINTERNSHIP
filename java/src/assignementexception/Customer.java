package assignementexception;

class Government extends Exception{
	String msg;
	Government(String msg){
		this.msg=msg;
	}
	public String getmsg() {
		return msg;
	}
}

class Poweragency{
	static int power=200;
	public static void powerconsumption(int power1) throws Government {
		if(power1<power) {
			System.out.println("the current is free");
		}
		else {
			throw new Government("the current is not free");
		}
	}
}

public class Customer {
	public static void main(String[] args) {
		try {
			Poweragency.powerconsumption(100);
		}
		catch(Government g) {
			System.out.println(g.getmsg());
		}
	}
}
