import java.util.Scanner;
class fibanocci{
public static void main(String str[]){
	System.out.println("Enter the number for fibonacci : ");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();

	int a=0;int b=1;int next;
	for(int i=0;i<num;i++){
		System.out.print(a+" ");
		next=(a+b);
		a=b;
		b=next;
		}
}
}