public class PatternMatchingSwitch {
    public static void check(Object obj) {
        if (obj instanceof Integer i) {
            System.out.println("Integer: " + i);
        } else if (obj instanceof String s) {
            System.out.println("String: " + s);
        } else if (obj instanceof Double d) {
            System.out.println("Double: " + d);
        } else {
            System.out.println("Unknown type");
        }
    }

    public static void main(String[] args) {
        check(10);
        check("Java");
        check(3.14);
    }
}
