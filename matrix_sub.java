import java.util.Scanner;
public class matrix_sub{
public static void main(String str[]){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the rows: ");
	int rows=sc.nextInt();
	System.out.print("Enter the columns: ");
	int cols=sc.nextInt();
	
	int[][] a=new int[rows][cols];
	int[][] b=new int[rows][cols];
	int[][] c=new int[rows][cols];   //for storing result(a-b)
	
	System.out.println("Enter the elements of matrix_1");
	for(int i=0;i<rows;i++){
		for(int j=0;j<cols;j++){
			a[i][j]=sc.nextInt();}}
	
	System.out.println("Enter the elements of matrix_2");
	for(int i=0;i<rows;i++){
		for(int j=0;j<cols;j++){
			b[i][j]=sc.nextInt();}}
	//subtraction
	for(int i=0;i<rows;i++){
		for(int j=0;j<cols;j++){
			c[i][j]=(a[i][j]-b[i][j]);}}
	
	System.out.println("Final result");
	for(int i=0;i<c.length;i++){
		for(int j=0;j<c[i].length;j++){
			System.out.print(c[i][j]+" ");}
		System.out.println();}
}
}