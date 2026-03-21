class Assignment1
{
	public static void main(String[] args) 
	{
		 int arr[] =new int[7];
		 System.out.println("It is using the new operator and integer datatype ");
		 System.out.println("-------------------------------------------------");
		 arr[0]=20;arr[1]=30;arr[2]=20;arr[3]=30;arr[4]=40;arr[5]=50;arr[6]=70;
		 for(int i=0;i<arr.length;i++){
			 System.out.println(" The value at index" + i +" is " +arr[i]);
		 }
		 System.out.println("It is without the new operator and integer datatype ");
		 System.out.println("-------------------------------------------------");
		 int arr1[] ={10,20,30,40,50,60,70};
		 for(int j=0;j<arr1.length;j++){
			 System.out.println(" The value at index" + j + " is " +arr1[j]);
		 }
		 
		 
		 double arr2[] =new double[7];
		 System.out.println("It is using the new operator and double datatype ");
		 System.out.println("-------------------------------------------------");
		 arr2[0]=20.3;arr2[1]=30.5;arr2[2]=20.6;arr2[3]=30.4;arr2[4]=40.9;arr2[5]=50.6;arr2[6]=70.2;
		 for(int k=0;k<arr.length;k++){
			 System.out.println(" The value at index" + k +" is " +arr2[k]);
		 }
		 System.out.println("It is without the new operator and double datatype ");
		 System.out.println("-------------------------------------------------");
		 double arr3[] ={10.1,20.4,30.5,40.3,50.4,60.6,70.9};
		 for(int l=0;l<arr3.length;l++){
			 System.out.println(" The value at index" + l + " is " +arr3[l]);
		 }
		 
		 
		 
		 System.out.println("It is using the new operator and String datatype ");
		 System.out.println("-------------------------------------------------");
		 String arr4[]=new String[6];
		 arr4[0]="Maruti";arr4[1]="Sunil";arr4[2]="Prashant";arr4[3]="Vinayak";arr4[4]="Ravi";arr4[5]="Ashik";
		 for(int m=0;m<arr4.length;m++){
			 System.out.println(" The value at index" + m +" is " +arr4[m]);
		 }
		 
		 System.out.println("It is without the new operator and String datatype ");
		 System.out.println("-------------------------------------------------");
		 String arr5[]={"Maruti","Vinayk","ravi","sunil","ashik"};
		 for(int n=0;n<arr5.length;n++){
			 System.out.println(" The value at index" + n +" is " +arr4[n]);
		 }
		 
		 System.out.println("It is using the new operator and Charcter datatype ");
		 System.out.println("-------------------------------------------------");
		 char arr6[]=new char[6];
		 arr6[0]='M';arr6[1]='A';arr6[2]='R';arr6[3]='U';arr6[4]='T';arr6[5]='I';
		 for(int o=0;o<arr6.length;o++){
			 System.out.println(" The value at index" + o +" is " +arr6[o]);
		 }
		 
		 System.out.println("It is without the new operator and Character datatype ");
		 System.out.println("-------------------------------------------------");
		 char arr7[]={'M','A','R','U','T','I'};
		 for(int p=0;p<arr7.length;p++){
			 System.out.println(" The value at index" + p +" is " +arr7[p]);
		 }
		 System.out.println("It is using the new operator and Boolean datatype ");
		 System.out.println("-------------------------------------------------");
		 boolean arr8[]=new boolean[2];
		 arr8[0]=true ;arr8[1]=false;
		 for(int q=0;q<arr8.length;q++){
			 System.out.println(" The value at index" + q +" is " +arr8[q]);
		 }
		 
		 System.out.println("It is without the new operator and Boolean datatype ");
		 System.out.println("-------------------------------------------------");
		 boolean arr9[]={true,false};
		 for(int p=0;p<arr9.length;p++){
			 System.out.println(" The value at index" + p +" is " +arr7[p]);
		 }
		 
	}
}
