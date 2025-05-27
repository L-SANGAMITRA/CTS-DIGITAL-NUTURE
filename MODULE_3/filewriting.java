import java.io.*;
import java.util.Scanner;

public class filewriting {
    public static void main(String[] args) throws IOException {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        FileWriter writer = new FileWriter("output.txt");
        writer.write(input);
        writer.close();
        System.out.println("Data written to file.");
    }
}
