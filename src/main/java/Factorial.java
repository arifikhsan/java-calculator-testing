public class Factorial {
    public static int factorialOf(Integer number) {
        if (number <= 1) {
            return 1;
        } else {
            return number * factorialOf(number - 1);
        }
    }
}
