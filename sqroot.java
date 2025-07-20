import java.util.Scanner;
public class sqroot{
    static void sqrt(){
	System.out.print("Enter the num for Square_root: ");
	Scanner sc=new Scanner(System.in);
	float num=sc.nextFloat();
	System.out.println("Square root of "+num+" is "+Math.sqrt(num));
	}
public static void main(String str[]){
	sqrt();
}
}
