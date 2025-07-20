import java.util.Scanner;
class count_chars{
public static void count(){
	System.out.print("Enter the String: ");
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();

	int uppercase=0;
	int lowercase=0; 
	int special=0;
	
	for(int i=0;i<str.length();i++){
		char ch=str.charAt(i);
		if(Character.isUpperCase(ch)){
			uppercase++;}
		else if(Character.isLowerCase(ch)){
			lowercase++;}
		else if(!Character.isDigit(ch)&&!Character.isWhitespace(ch)){
			special++;}
	}
	System.out.println("Uppercases= "+uppercase);
	System.out.println("Lowercases= "+lowercase);
	System.out.println("Specialcases= "+special);
}
public static void main(String str[]){
	count();
}
}