import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 different numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        sortArray(numbers);

        System.out.print("Sorted Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        int secondLowest = findSecondLowest(numbers);
        int secondHighest = findSecondHighest(numbers);

        System.out.println("Second Lowest Number: " + secondLowest);
        System.out.println("Second Highest Number: " + secondHighest);
    }
    static void sortArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static int findSecondLowest(int[] arr) {
        int lowest = arr[0];
        for (int num : arr) {
            if (num != lowest) {
                return num;
            }
        }
        return -1;
    }

    static int findSecondHighest(int[] arr) {
        int highest = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != highest) {
                return arr[i];
            }
        }
        return -1;
    }
}
