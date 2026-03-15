package encapsulation;

class Main4{
	private String pwd="hi@123";

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
}


public class Snapshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main4 f1=new Main4();
		System.out.println(f1.getPwd());
		
		
	}

}
