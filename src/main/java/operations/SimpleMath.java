package operations;

public class SimpleMath {

    static public int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }
    static public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    static public double divide(int num1, int num2) {
        if (num1 == 0) throw new ArithmeticException("Zero cannot be divided to any number.");
        return num1 / num2;
    }
}
