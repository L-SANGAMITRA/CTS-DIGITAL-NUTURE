import java.util.concurrent.*;
import java.util.*;

public class executorserviceandcallable {
    public static void main(String[] args) throws Exception {
        ExecutorService es = Executors.newFixedThreadPool(3);
        List<Callable<Integer>> tasks = List.of(
            () -> 10 + 20,
            () -> 30 + 40,
            () -> 50 + 60
        );
        List<Future<Integer>> results = es.invokeAll(tasks);
        for (Future<Integer> f : results)
            System.out.println("Result: " + f.get());
        es.shutdown();
    }
}
