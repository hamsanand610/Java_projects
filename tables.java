import java.util.Scanner;
class tables{
public static void main(String str[]){
	System.out.print("Enter the number : ");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();

	for(int i=1;i<=10;i++){
		System.out.println(num+" x "+i+" = "+(num*i));}
}
}