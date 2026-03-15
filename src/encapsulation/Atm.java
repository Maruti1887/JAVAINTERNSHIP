package encapsulation;
class Main3{
	private int pwd=26483836;

	public int getPwd() {
		return pwd;
	}

	public void setPwd(int pwd) {
		this.pwd = pwd;
	}

	
}
public class Atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main3 m1=new Main3();
		System.out.println(m1.getPwd());
		m1.setPwd(27454566);
		System.out.println(m1.getPwd());

	}

}
