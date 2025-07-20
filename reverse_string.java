import java.util.Scanner;
class reverse_string{
public static void main(String args[]){
	System.out.print("Enter the string: ");
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	
	String reverse="";
	for(int i=str.length()-1;i>=0;i--){
		reverse=reverse+str.charAt(i);
		}
		System.out.print("Reversed: "+reverse);

	 //System.out.println(str.charAt(i));
}
}