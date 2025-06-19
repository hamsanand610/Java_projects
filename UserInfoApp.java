import java.util.Scanner;
public class UserInfoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your age: ");
        int age = scanner.hasNextInt() ? scanner.nextInt() : -1;
        scanner.nextLine(); 

        if (age < 0) {
            System.out.println("Invalid age. Please enter a non-negative integer.");
            return;
        }

        System.out.print("Enter your profession: ");
        String profession = scanner.nextLine();

        System.out.println("User Information");
        System.out.println("Name      : " + name);
        System.out.println("Age       : " + age);
        System.out.println("Profession: " + profession);

        if (age <= 12) {
            System.out.println("You're a child.");
        } else if (age <= 19) {
            System.out.println("You're a teenager.");
        } else if (age <= 59) {
            System.out.println("You're an adult.");
        } else {
            System.out.println("You're a senior citizen.");
        }

        scanner.close();
    }
}
