import java.util.Scanner;
class Leapyear{
int leapyear(){
	System.out.print("Enter a year: ");
	Scanner sc=new Scanner(System.in);
	int year=sc.nextInt();
	if((year%4==0 && year%100!=0) || (year%400 ==0)){
		System.out.println(year+" is a leap year");}
	else{
		System.out.println(year+" is not a leap year");}
	
	return -1;
}
public static void main(String str[]){
	Leapyear obj=new Leapyear();
	obj.leapyear();
}
}