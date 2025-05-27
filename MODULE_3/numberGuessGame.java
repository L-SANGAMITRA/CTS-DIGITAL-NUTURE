import java.util.*;

public class numberGuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = new Random().nextInt(100) + 1;
        int guess;
        do {
            System.out.print("Guess the number: ");
            guess = sc.nextInt();
            if (guess > target) System.out.println("Too high");
            else if (guess < target) System.out.println("Too low");
        } while (guess != target);
        System.out.println("Correct!");
    }
}
