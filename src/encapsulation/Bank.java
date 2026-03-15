package encapsulation;
class Mainclass{
	private int Accno=26483836;

	public int getAccno() {
		return Accno;
	}

	public void setAccno(int accno) {
		Accno = accno;
	}

	
}
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mainclass m1=new Mainclass();
		System.out.println(m1.getAccno());
		m1.setAccno(27454566);
		System.out.println(m1.getAccno());

	}

}
