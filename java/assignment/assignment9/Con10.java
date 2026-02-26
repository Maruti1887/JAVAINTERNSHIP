class Con10
{	
	
	int e_sal;
	char e_grade;
	int e_id;
	Con10(int a,char b,int c){
		
		e_sal=a;
		e_grade=b;
		e_sal=c;
	}
	
	public static void main(String[] args) 
	{
		Con10 c=new Con10(10000,'A',20);
		System.out.println(c.e_sal);
		System.out.println(c.e_grade);
		System.out.println(c.e_id);
		
	}
}
