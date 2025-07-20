import java.util.Scanner;
class strlength{
public static void main(String[] args){
	System.out.print("Enter the String: ");
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	
	int len=str.length();
	System.out.print("Length: "+len);
}
}