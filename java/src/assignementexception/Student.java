package assignementexception;

class VtuPortal extends Exception{
	static String captcha;
	VtuPortal(String captcha){
		this.captcha=captcha;
	}
	public String getcaptcha(){
		return captcha;
	}
}

class Website{
	static String captcha1="899A";
	public static void Result(String captcha) throws VtuPortal {
		if(captcha.equals(captcha1)) {
			System.out.println("result is displaying");
		}
		else {
			throw new VtuPortal("captcha is incorrec");
		}
	}
}

public class Student{
	public static void main(String[] args) {
		
	try {
		Website.Result("899A");
	}
	catch(VtuPortal e) {
		System.out.println(e.getcaptcha());
	}
}
}
