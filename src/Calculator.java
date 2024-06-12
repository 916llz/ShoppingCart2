// Calculator.java
public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public double divide(int dividend, int divisor) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException("o divisor nao pode ser 0");
        }
        return (double) dividend / divisor;
    }
}