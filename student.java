import java.util.Scanner;
class student{
public static void main(String str[]){
	System.out.print("Enter student_Rollno: ");
	Scanner sc=new Scanner(System.in);
	int rollno=sc.nextInt();
	System.out.println("Enter 3 marks");
	System.out.print("Mark_1= ");
	float m1=sc.nextFloat();
	System.out.print("Mark_2= ");
	float m2=sc.nextFloat();
	System.out.print("Mark_3= ");
	float m3=sc.nextFloat();
	float sum=(m1+m2+m3);
	System.out.println("total is "+sum);
	float avg=sum/3;
	System.out.println("Average is "+avg);
	
}
}