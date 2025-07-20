import java.util.Scanner;
public class smallest{
    static void small(){
	int a,b;
	System.out.println("Enter 2 numbers: ");
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	b=sc.nextInt();
	int result=a<b?a:b;
	System.out.println(result+" is smallest");
}
public static void main(String str[]){
	small();
}
}
