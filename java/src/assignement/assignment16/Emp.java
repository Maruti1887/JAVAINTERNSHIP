package assignement.assignment16;

public class Emp {
	
	int eid;
	int esal;
	char egrade;
	
	Emp(int a,int b,char c){
		
		eid=a;
		esal=b;
		egrade=c;
	}
	public String toString() {
		return egrade+" "+esal+" "+egrade;
	}
	public static void main(String[] args) {
		Emp l1=new Emp(20,30000,'A');
		System.out.println(l1);
	}
	

}
