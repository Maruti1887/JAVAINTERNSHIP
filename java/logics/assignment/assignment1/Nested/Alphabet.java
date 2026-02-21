class Alphabet
{
	public static void main(String[] args) 
	{
		char ch='#';
		if(ch>='A' && ch<='B' || ch>='a' && ch<='b'){
			if(ch=='a' || ch == 'e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch == 'E' || ch=='I' || ch=='O' || ch=='U')
				System.out.println("The alphabet is vowel ");
			else
				System.out.println(" The alphabe is consonat");
		}
		else
			System.out.println(" The Character is special character");
	}
}
