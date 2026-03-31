package assignementexception;


class Boy extends Exception{
	String msg;
	Boy(String msg){
		this.msg=msg;
	}
	public String geatmsg() {
		return msg;
	}
}
class Shadi{
	static String ajob="Doctor";
	static void jobchecking(String b) throws Boy{
		if(ajob.equals(b)) {
			System.out.println("the boy is okfor girl");
		}
		else {
			throw new Boy("the boy isnot ok");
		}
}

public class Girl {
	public static void main(String[] args) {
		try {
			Shadi.jobchecking("Doctor");
		}
		catch(Boy b) {
			System.out.println(b.geatmsg());
		}
	}
}}
