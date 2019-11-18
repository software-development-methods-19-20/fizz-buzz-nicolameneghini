package test;

import dssc.fizzbuzz.FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFizzBuzz {

    @Test
    void isFizzForMultipleOfThree(){assertEquals("Fizz", FizzBuzz.print(51));}

    @Test
    void isBuzzForMultipleOfFive(){assertEquals("Buzz", FizzBuzz.print(25));}

    @Test
    void isFizzBuzzForMultipleOfThreeAndFive(){assertEquals("FizzBuzz", FizzBuzz.print(60));}

    @Test
    void isBangForMultipleOfSeven(){assertEquals("Bang", FizzBuzz.print(7));}

    @Test
    void isFizzBangForMultipleOfThreeAndSeven(){assertEquals("FizzBang", FizzBuzz.print(42));}

    @Test
    void isBuzzBangForMultipleOfFiveAndSeven(){assertEquals("BuzzBang", FizzBuzz.print(70));}

    @Test
    void isFizzBuzzBangForMultipleOfThreeFiveAndSeven(){assertEquals("FizzBuzzBang", FizzBuzz.print(105));}


}