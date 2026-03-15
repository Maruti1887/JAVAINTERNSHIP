package encapsulation;



class Main1{
	private char grade='A';

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	

	
}
public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main1 m1=new Main1();
		System.out.println(m1.getGrade());
		m1.setGrade('B');
		System.out.println(m1.getGrade());

	}

}
