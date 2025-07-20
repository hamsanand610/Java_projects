import java.util.Scanner;
public class left_triangle{
    public static void main (String[] args){
        int n;
	Scanner sc=new Scanner(System.in);
	System.out.print("enter n: ");
	n=sc.nextInt();

        for(int i=1;i<=n;i++){
            	for(int j=i;j<=n;j++){
                System.out.print("@ ");
            }
            System.out.println();
        }
        sc.close();
    }
}