package assignementexception;

class Election extends Exception{
	static String msg;
	Election(String msg){
		this.msg=msg;
	}
	public String getmsg() {
		return msg;
	}
	
}
class Vote{
	static int cage=18;
	static void withdraw(int age)throws Election{
		if(age>cage) {
			System.out.println("you are eligible to become a voter");
		}
		else {
			throw new Election("you are not eligible to become a voter");
		}
	}
}

public class Person {
	public static void main(String[] args) {
		try {
			Vote.withdraw(19);
		}
		catch(Election e) {
			System.out.println(e.getmsg());
			
		}
	}
}
