package calculator;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double X(int a, int b) throws Exception {
        if (b == 0) {
            throw new Exception("divideByZero");
        } else if ((a < 0 && b > 0) || (b < 0 && a > 0)) {
            throw new Exception("negativeUnderSqrt");
        } else {
            return Math.sqrt(((double) a) / ((double) b));
        }
    }
}