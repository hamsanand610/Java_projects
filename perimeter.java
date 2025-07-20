import java.util.Scanner;
class perimeter{
public static float peri(float l,float b){
	float a=(2*(l+b));
	System.out.print("Perimeter of rectangle: "+a);
	return 0;
}
public static void main(String args[]){
	System.out.println("enter the length & breadth of rec: ");
	Scanner sc=new Scanner(System.in);
	float l=sc.nextFloat();
	float b=sc.nextFloat();
	System.out.println("length: "+l);
	System.out.println("breadth: "+b);
	peri(l,b);
}
}