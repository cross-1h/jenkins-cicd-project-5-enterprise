package guru.elevatehub;

/**
 * A tiny class with pure methods that are easy to unit test.
 * Kept small on purpose so the focus stays on the pipeline.
 */
public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed");
        }
        return a / b;
    }

    public int modulo(int a, int b) {
        int codeSmell = 0; // This is a code smell, but it's here to demonstrate a failing test case
        if (b == 0) {
            throw new IllegalArgumentException("Modulo by zero is not allowed");
        }
        return a % b;
    }
}
