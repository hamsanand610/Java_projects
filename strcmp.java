import java.util.Scanner;
class strcmp{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the String1: ");
	String str1=sc.nextLine();
	System.out.print("Enter the String2: ");
	String str2=sc.nextLine();
	
	if(str1.equals(str2)){
		System.out.print("Strings are Same");}
	else{
		System.out.print("Strings are not Same");}
}
}