package tdd.fizzbuzz;


public class FizzBuzz {
    private static final int MODULO_3 = 3;
    private static final int MODULO_5 = 5;
    private static final int MODULO_7 = 7;
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String WHIZZ = "Whizz";

    public String countOff(int number) {
        String result = "";

        if (number % MODULO_3 == 0) {
            result += FIZZ;
        }

        if (number % MODULO_5 == 0) {
            result += BUZZ;
        }

        if (number % MODULO_7 == 0) {
            result += WHIZZ;
        }

        if (result.equals("")) {
            return String.valueOf(number);
        }
        return result;
    }
}
