import java.util.Scanner;
public class leap_ternary{
    static void leapyear(){
	System.out.print("Enter a year: ");
	Scanner sc=new Scanner(System.in);
	int year=sc.nextInt();
	String result=((year%4==0 && year%100!=0) || (year%400 ==0))?"is a leap year":"not a leap year";
	System.out.println(year+" "+result);
}
public static void main(String str[]){
	leapyear();
}
}
