import java.util.Scanner;
class upper_triangle{
public static void main(String str[]){
	System.out.print("enter n:");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
	for(int i=1;i<=n;i++){
		for(int j=1;j<=i;j++){
			System.out.print("  ");}
		
		for(int j=i;j<=n;j++){
			System.out.print("* ");}

		System.out.println();}
} 
}