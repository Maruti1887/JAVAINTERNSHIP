class Palindrome 
{
	public static void main(String[] args) 
	{
		String str="MADAM";
		String rev="";
		for(int i=str.length()-1;i>=0;i--){
			rev=rev+str.charAt(i);
			
		}
		if(str.equals(rev))
		{
			System.out.println(" the no is palindrome");
		}
		else{
			System.out.println(" the string is not palindrome");
		}
	}
}
