import java.util.stream.DoubleStream;

public class Calculator {
    static double add(double... operands) {
        return DoubleStream.of(operands).sum();
    }

    static double subtract(double numberOne, double numberTwo) {
        return numberOne - numberTwo;
    }

    static double multiply(double... operands) {
        return DoubleStream.of(operands).reduce(1, (a, b) -> a * b);
    }
}
