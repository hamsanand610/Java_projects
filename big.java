import java.util.Scanner;
class big{
void biggest(){
	System.out.println("Enter 3 numbers: ");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	if(a>=b && a>=c){
		System.out.println(a+" is biggest");}
	else if(b>=a && b>=c){
		System.out.println(b+" is biggest");}
	else{
		System.out.println(c+" is biggest");}
	
}
public static void main(String str[]){
	big obj=new big();
	obj.biggest();
}
}