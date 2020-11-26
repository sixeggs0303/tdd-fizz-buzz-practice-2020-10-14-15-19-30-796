package tdd.fizzbuzz;

public class FizzBuzz {
    public String countOff(int number) {
        String result = "";

        if (number % 3 == 0) {
            result += "Fizz";
        }

        if (number % 5 == 0) {
            result += "Buzz";
        }

        if (result.equals("")) {
            return String.valueOf(number);
        }
        return result;
    }
}
