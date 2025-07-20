import java.util.Scanner;
class OddEven{
int oddEven(){
	System.out.print("Enter a number: ");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	if(a%2==0){
		System.out.println("Given num is even");}
	else{
		System.out.println("Given num is odd");}
	return 0;
}
public static void main(String str[]){
	OddEven obj=new OddEven();
	obj.oddEven();
}
}