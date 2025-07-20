import java.util.Scanner;
class days_conversion{
public static void main(String str[]){
	System.out.print("Enter the days : ");
	Scanner sc=new Scanner(System.in);
	int ip_days=sc.nextInt();
	int years = ip_days/365;
	int rem_days= ip_days%365;
	int weeks = rem_days/7;
	int days = rem_days%7;
	System.out.print(years+"years"+" "+weeks+"weeks"+" "+days+"days");
}
}