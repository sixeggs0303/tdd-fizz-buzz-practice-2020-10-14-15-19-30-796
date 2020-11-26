package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void should_return_1_when_count_off_given_order_number_1() {
        // given
        int order = 1;
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String actual = fizzBuzz.countOff(order);

        // then
        assertEquals("1", actual);
    }

    @Test
    void should_return_fizz_when_count_off_given_order_number_3() {
        // given
        int order = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String actual = fizzBuzz.countOff(order);

        // then
        assertEquals("Fizz", actual);
    }

    @Test
    void should_return_buzz_when_count_off_given_order_number_5() {
        // given
        int order = 5;
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String actual = fizzBuzz.countOff(order);

        // then
        assertEquals("Buzz", actual);
    }
}
