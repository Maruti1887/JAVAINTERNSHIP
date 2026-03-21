class Demo21
{
	public static String disp(String abc)
	{
		String rev="";
		for(int i=abc.length()-1;i>=0;i++){
			rev=rev+abc.charAt(i);
			
		}
		return rev;
	}
	public static void main(String[] args) 
	{
		Demo21 v=disp("MARUTI");
		System.out.println("The reverse of the string is "+v);
	}
}
