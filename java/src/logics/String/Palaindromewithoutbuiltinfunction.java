class Palaindromewithoutbuiltinfunction
{
	public static void main(String[] args) 
	{
		String str="MAruti";
		char [] ch=str.toCharArray();
		int i= 0;
		int j=ch.length-1;
		while(i<j){
			if(ch[i]!=ch[j]){
				System.out.println(" The string is not palindrome ");
				return;
			}
			i++;
			j--;
		}		
		System.out.println("The String is palindrome");
	}
}
