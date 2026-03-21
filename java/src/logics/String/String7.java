class String7 
{
	public static void main(String[] args) 
	{
		String str="maarruuttii";
		char [] arr=str.toCharArray();
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]!=arr[i+1])
			{
				System.out.print(arr[i]);
			}
		}
		System.out.println(arr[arr.length-1]);
	}
}
