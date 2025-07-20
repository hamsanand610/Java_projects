import java.util.Scanner;
class sumofnos{
public static void main(String str[]){
	System.out.print("Enter the 3 digit no: ");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt(); 
	if(num>999 || num<100){
		System.out.println("Enter valid 3 digit number only");
		return;
		}
	int original=num;
	int sum=0;
	while(num>0){			// optional
		int digit=num % 10;
		sum=sum + digit;
		num=num / 10;
		}
	System.out.println("sum of digits of num "+original+": "+sum);

}
}