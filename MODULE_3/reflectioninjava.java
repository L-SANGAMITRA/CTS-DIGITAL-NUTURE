import java.lang.reflect.*;

public class reflectioninjava {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("java.lang.String");
        for (Method m : cls.getDeclaredMethods()) {
            System.out.println(m.getName());
        }
    }
}
