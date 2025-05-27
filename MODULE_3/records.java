public record records(String name, int age) {

    // Custom constructor with validation or any logic
    public records {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }

    // Optionally, you can still define methods
    public String greeting() {
        return "Hello, " + name + "!";
    }
}
