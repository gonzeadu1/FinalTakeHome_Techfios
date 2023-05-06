import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Practice1 {

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N for the Nth smallest number: ");
        n = scanner.nextInt();
        int[] numbers = new int[500];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(901) + 100; // Generate numbers between 100-1000
            Arrays.sort(numbers);

        }
        System.out.printf("The %dth smallest number is: %d", n, numbers[n - 1]);
    }
}