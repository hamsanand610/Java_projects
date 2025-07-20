import java.util.Scanner;
class upcase_lowcase{
public static void lowcase(){
	System.out.print("Enter the uppercase character: ");
	Scanner sc=new Scanner(System.in);
	char ch=sc.next().charAt(0);
	if(ch<'A' || ch>'Z'){
		System.out.println("ERROR!!enter a uppercase character");
	}else{
		char lower=Character.toLowerCase(ch);
		System.out.println("In lowercase "+lower);
	}
}
public static void main(String str[]){
	lowcase();
}
}