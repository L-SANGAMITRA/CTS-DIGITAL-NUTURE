import java.util.*;

public class hashmapexample {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> map = new HashMap<>();
        map.put(101, "Alice");
        map.put(102, "Bob");
        int id = sc.nextInt();
        System.out.println("Name: " + map.get(id));
    }
}
