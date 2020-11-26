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

    @Test
    void should_return_whizz_when_count_off_given_order_number_7() {
        // given
        int order = 7;
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String actual = fizzBuzz.countOff(order);

        // then
        assertEquals("Whizz", actual);
    }

    @Test
    void should_return_fizzbuzz_when_count_off_given_order_number_15() {
        // given
        int order = 15;
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String actual = fizzBuzz.countOff(order);

        // then
        assertEquals("FizzBuzz", actual);
    }

    @Test
    void should_return_fizzwhizz_when_count_off_given_order_number_21() {
        // given
        int order = 21;
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String actual = fizzBuzz.countOff(order);

        // then
        assertEquals("FizzWhizz", actual);
    }

    @Test
    void should_return_buzzwhizz_when_count_off_given_order_number_35() {
        // given
        int order = 35;
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String actual = fizzBuzz.countOff(order);

        // then
        assertEquals("BuzzWhizz", actual);
    }

    @Test
    void should_return_fizzbuzzwhizz_when_count_off_given_order_number_105() {
        // given
        int order = 105;
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String actual = fizzBuzz.countOff(order);

        // then
        assertEquals("FizzBuzzWhizz", actual);
    }
}
