import java.util.Scanner;
class anycase_upcase{
public static void upcase(){
	System.out.print("Enter the anycase character: ");
	Scanner sc=new Scanner(System.in);
	char ch=sc.next().charAt(0);
	char upper=Character.toUpperCase(ch);
		System.out.println("In uppercase "+upper);
}
public static void main(String str[]){
	upcase();
}
}