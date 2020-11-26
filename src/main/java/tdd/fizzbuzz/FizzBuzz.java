package tdd.fizzbuzz;


public class FizzBuzz {
    private final String FIZZ = "Fizz";
    private final String BUZZ = "Buzz";
    private final String WHIZZ = "Whizz";

    public String countOff(int number) {
        String result = "";

        if (number % 3 == 0) {
            result += FIZZ;
        }

        if (number % 5 == 0) {
            result += BUZZ;
        }

        if (number % 7 == 0) {
            result += WHIZZ;
        }

        if (result.equals("")) {
            return String.valueOf(number);
        }
        return result;
    }
}
