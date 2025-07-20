import java.util.Scanner;
class nums_order{
public static void main(String str[]){
	System.out.println("Enter any 10 numbers: ");
	Scanner sc=new Scanner(System.in);
	int[] a=new int[10];
	
	for(int i=0;i<10;i++){
		a[i]=sc.nextInt();}
	
	System.out.println("First 5 in original order:");
	for(int i=0;i<5;i++){
			System.out.print(a[i]+" ");
			}

	System.out.println();
	System.out.println("Last 5 in reverse order:");
	for(int i=9;i>=5;i--){
			System.out.print(a[i]+" ");}
}
}