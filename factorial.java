import java.util.Scanner;
public class factorial{
    public static void main (String[] args){
        int n;
	Scanner sc=new Scanner(System.in);
	System.out.print("enter number for factorial: ");
	n=sc.nextInt();
	if(n>=0){
		int fact=1;
		for(int i=1;i<=n;i++){
			fact=fact*i;
			}
		System.out.println("Factorial of "+n+" is"+" "+fact);}
	else{
		System.out.println("Enter valid number");}
}
}