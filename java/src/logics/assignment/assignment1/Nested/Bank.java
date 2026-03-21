class Bank
{
	
	public static void main(String[] args) 
	{
		String acc="Yes";
		int pin=2020;
		if(acc=="Yes"){
			if(pin==2020)
				System.out.println("withdraw is possible");
			else
				System.out.println("Withdraw is not possible");
			
		}
		else
			System.out.println("the user does not have account");
	}
}
