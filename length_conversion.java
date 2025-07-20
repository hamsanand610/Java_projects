import java.util.Scanner;
class length_conversion{
static void centi(float cm){
	float metre=(cm/100);
	System.out.println(metre+" in meters");
	float kilo=(cm/100000);
	System.out.println(kilo+" in kilometers");
	
}
public static void main(String str[]){
	System.out.print("Enter the lenght in centimeters: ");
	Scanner sc=new Scanner(System.in);
	float cm=sc.nextFloat();
	centi(cm);
}
}