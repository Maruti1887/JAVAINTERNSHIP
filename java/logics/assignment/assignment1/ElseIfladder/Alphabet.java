class Alphabet
{
	public static void main(String[] args) 
	{
		char a='A';
		if(a>='a' && a<='z')
			System.out.println("loweercase");
		else if(a>='A' && a<='Z')
			System.out.println("uppercase");
		else if(a>='0' && a<='9')
			System.out.println("digit");
		else
			System.out.println("special character");
	}
}
