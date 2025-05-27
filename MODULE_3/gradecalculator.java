import java.util.Scanner;

public class gradecalculator {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        char grade = (marks >= 90) ? 'A' :
                     (marks >= 80) ? 'B' :
                     (marks >= 70) ? 'C' :
                     (marks >= 60) ? 'D' : 'F';
        System.out.println("Grade: " + grade);
    }
}
