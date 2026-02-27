class Con10
{	
	
	int e_sal;
	char e_grade;
	int e_id;
	Con10(int e_sal,char e_grade,int e_id){
		
		this.e_sal=e_sal;
		this.e_grade=e_grade;
		this.e_sal=e_sal;
	}
	
	public static void main(String[] args) 
	{
		Con10 c=new Con10(10000,'A',20);
		System.out.println(c.e_sal);
		System.out.println(c.e_grade);
		System.out.println(c.e_id);
		
	}
}
