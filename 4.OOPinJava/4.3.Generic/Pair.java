// Task 3:
// Implement a generic class `Pair<T, U>` that holds two values.
// Provide setFirst, setSecond, getFirst, and getSecond methods.

class Pair<T, U> {
    // TODO: declare fields

    // TODO: implement constructors

    // TODO: implement setFirst, setSecond, getFirst, getSecond
}

public class Main {
    public static void main(String[] args) {
        Pair<String, Integer> p1 = new Pair<>("age", 30);
        System.out.println(p1.getFirst() + ": " + p1.getSecond());
        // Expected: age: 30

        Pair<Double, Double> p2 = new Pair<>();
        p2.setFirst(3.14);
        p2.setSecond(2.718);
        System.out.println("π ≈ " + p2.getFirst() + ", e ≈ " + p2.getSecond());
        // Expected: π ≈ 3.14, e ≈ 2.718
    }
}
