package ExceptionHandling;

class Bank extends Exception{
	static String msg;
	Bank(String msg){
		this.msg=msg;
	}
	public String getmsg() {
		return msg;
	}
}

class Sendingmsg{
	static String msg1="Hello";
	public static void send(String str) throws Bank {
		if(msg1.equals(str)) {
			System.out.println("the message is sent");
		}
		else {
			throw new Bank("the message is not sent");
		}
	}
}


public class Banksendingmsg {
 	public static void main(String[] args) {
		try {
			Sendingmsg.send("Hello");
		}
		catch(Bank b) {
			System.out.println(b.getmsg());
		}
	}
}
