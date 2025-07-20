import java.util.Scanner;
public class matrix{

public static void main(String str[]){
int rows,cols;
Scanner sc=new Scanner(System.in);
System.out.print("Enter rows : ");
rows=sc.nextInt();
System.out.print("Enter cols : ");
cols=sc.nextInt();

int[][] a;
a=new int[rows][cols];
System.out.println("enter elements");
for(int i=0;i<rows;i++){
	for(int j=0;j<cols;j++){
		a[i][j]=sc.nextInt();
}
}
System.out.println("Matrix form ");
for(int i=0;i<a.length;i++){
	for(int j=0;j<a[i].length;j++){
		System.out.print(a[i][j]+"\t");
}
	System.out.println();
}
sc.close();
}
}
