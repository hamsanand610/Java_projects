import java.util.Scanner;
class palindrome{
public static void main(String args[]){
	System.out.println("Enter the String: ");
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();

	String reverse="";
	for(int i=str.length()-1;i>=0;i--){
		 reverse=reverse+str.charAt(i);
		}

	if(str.equals(reverse)){
		System.out.println("Palindrome");}
	else{
		System.out.println("Not Palindrome");}
}
}