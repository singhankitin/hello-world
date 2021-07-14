public class Factorial {

    public int recursive(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("numbers less than zero do not have a factorial");
        } else if (number == 0) {
            System.out.printf("\nreturn 1");
            return 1;
        } else {
            System.out.printf("\nreturn %s * recursive(%s - 1)", number, number);
            return number * recursive(number - 1);
        }
    }

    public int iterative(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("numbers less than zero do not have a factorial");
        } else if (number == 0) {
            return 1;
        } else {
            int factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial = factorial * i;
            }
            return factorial;
        }
    }
}
