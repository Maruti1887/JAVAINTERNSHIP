class Student
{
	// String std_name;
	//int std_id;
	//char std_section;
	Student()
	{
		String std_name;
		int std_id;
		char std_section;
		
		std_name=x;
		std_id=y;
		std_section=z;
	}
	public static void main(String[] args)
	{
		Student s=new Student("maruti",101,'A');
		System.out.println(s.std_name);
		System.out.println(s.std_id);
		System.out.println(s.std_section);
	}
}
		