package assignementexception;


class College extends Exception{
	static String msg;
	College(String msg){
		this.msg=msg;
	}
	public String getmsg() {
		return msg;
	}
}

class Attendance{
	static String pre1="Yes";
	public static void check(String str) throws College{
		if(pre1.equals(str)) {
			System.out.println("the student is Presnt ");
		}
		else {
			throw new College("the student is absent ");
		}
	}
}

public class Teacher {
	public static void main(String[] args) {
		
		try {
			Attendance.check("Yes");
		}
		catch(College a){
			System.out.println(a.getmsg());
		}
	}
}
