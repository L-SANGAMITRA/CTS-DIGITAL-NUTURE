import java.util.Scanner;

public class arraylistexample {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        for (int num : arr) sum += num;
        System.out.println("Sum: " + sum + ", Average: " + (sum / (double)n));
    }
}
