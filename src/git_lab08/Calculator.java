package git_lab08;



public class Calculator {

    // Method to perform addition with input validation
    public int addition(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Inputs must be non-negative integers.");
        }
        return a + b;
    }

    // Method to perform multiplication with input validation
    public int multiplication(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Inputs must be non-negative integers.");
        }
        return a * b;
    }

}
