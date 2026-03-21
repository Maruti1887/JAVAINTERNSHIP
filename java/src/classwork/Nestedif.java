class Nestedif 
{
	public static void main(String[] args) 
	{
		int marks=12;
		int passm=35;
		if( marks>passm){
			if( marks>85){
				System.out.println(" the student get the distinction");
				
			}
			else{
				System.out.println(" the Student get only first class");
				
			}
		}
		else{
			if(marks>30){
				System.out.println(" the student can passs in the next exam");
			}
			else{
				System.out.println(" the student wil never pass");
		
			}
		}
}
}