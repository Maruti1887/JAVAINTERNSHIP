import java.util.Scanner;
class Circle 
{
	static void area(int r){
		final double pi=3.142;
		double a=pi*r*r;
		System.out.println("the area of circle with "+r+" :"+a);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size:");
		int s=sc.nextInt();
		int [] a=new int[s];
		for(int i=0;i<s;i++){
			System.out.println("enter the array value "+i+" :");
			a[i]=sc.nextInt();
			area(a[i]);
		}
	}
}
