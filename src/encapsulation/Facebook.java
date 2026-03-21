package encapsulation;

class Fb{
	private String pwd="hi@1234";

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
}
public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fb f1=new Fb();
		System.out.println(f1.getPwd());
		System.out.println();
		
		
	}

}
