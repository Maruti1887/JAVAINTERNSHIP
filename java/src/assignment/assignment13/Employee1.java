class Employee1
{
	void disp(int no){
		System.out.println("this is the employee no");
	}
	
	void disp(String s){
		System.out.println("This is the employee name");
	}
	
	
	
	public static void main(String[] args) 
	{
		Employee1 e1=new Employee1();
		e1.disp(45);
		e1.disp("MARUTI");
		
	}
}
