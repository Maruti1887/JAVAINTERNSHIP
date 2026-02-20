class Product

{	static int product=1;
	static int i;
	public static void area(int start , int end){
		product=1;
		for(i=start;i<=end;i++){
			product=product*i;
		}
		System.out.println(" The Product is"+product);
	}
	
	public static void area1(int start , int end){
		product=1;
		for(i=end;i>=start+3;i--){
			product=product*i;
		}
		System.out.println(" The Product is"+product);
	}
	public static void area2(int start, int end){
		product=1;
		for(i=end-3;i>=start;i--){
			product=product*i;
		}
		System.out.println(" The Product is"+product);
	}
	public static void area3(int start,int end){
		int count=0;
		for(i=start;i<=end;i++){
			count=count+1;
		}
		System.out.println(" The Product is"+count);
	}
	public static void area4(int start,int end){
		int count=0;
		for(i=start;i<=end;i++){
			if(i%2==0)
				count=count+1;
		}
		System.out.println(" The Product is"+count);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("The product is");
		area(1,6);
		area1(1,6);
		area2(1,6);
		area3(1,6);
		area4(1,6);
	}
}
