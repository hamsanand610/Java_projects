import java.util.Scanner;
class max_arr{
public static void main(String args[]){
	System.out.print("Enter the no.of.elements of array: ");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] a=new int[n];

	System.out.println("Enter the elements:");
	for(int i=0;i<n;i++){
		 a[i]=sc.nextInt();}

	int max=a[0];
	for(int i=0;i<n;i++){
		if(a[i]>max){
			max=a[i];}}
	 System.out.println("Maximum element of array is "+max);
}
}